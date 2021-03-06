package org.sifrproject.parameters;


import org.sifrproject.parameters.api.ParameterHandler;
import org.sifrproject.parameters.exceptions.InvalidParameterException;
import org.sifrproject.postannotation.ScoringPostAnnotator;
import org.sifrproject.postannotation.api.PostAnnotationRegistry;
import org.sifrproject.postannotation.api.PostAnnotator;
import org.sifrproject.scoring.CValueScore;
import org.sifrproject.scoring.OldScore;
import org.sifrproject.scoring.api.Scorer;
import org.sifrproject.util.RequestGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DisambiguateParameterHandler implements ParameterHandler {
    private static final Logger logger = LoggerFactory.getLogger(DisambiguateParameterHandler.class);
    @Override
    public void processParameter(final RequestGenerator parameters, final PostAnnotationRegistry postAnnotationRegistry) throws InvalidParameterException {
        logger.info("Processing score parameter");
        if (parameters.containsKey("score")) {
            final String score = parameters.get("score");
            parameters.remove("score");

            final Scorer scorer;
            switch (score) {
                case "old":
                    scorer = new OldScore();
                    break;
                case "cvalue":
                    scorer = new CValueScore(true);
                    break;
                case "cvalueh":
                    scorer = new CValueScore(false);
                    break;
                default:
                    throw new InvalidParameterException(String.format("Invalid value for score parameter -- %s", score));
            }

            double score_threshold = -1d;
            double confidence_threshold = -1d;
            if(parameters.containsKey("score_threshold")){
                final String threshold = parameters.get("score_threshold");
                parameters.remove("score_threshold");
                score_threshold = Double.valueOf(threshold);

            }

            if(parameters.containsKey("confidence_threshold")){
                final String threshold = parameters.get("confidence_threshold");
                parameters.remove("confidence_threshold");
                confidence_threshold = Double.valueOf(threshold);

            }

            final PostAnnotator scorePostAnnotator = new ScoringPostAnnotator(scorer, score_threshold, confidence_threshold);
            postAnnotationRegistry.registerPostAnnotator(scorePostAnnotator);
            logger.info("Registered score post-annotator");
        } else if(parameters.containsKey("threshold")){
            throw new InvalidParameterException("The threshold parameter requires the score parameter");
        }
    }
}
