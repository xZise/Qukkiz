package de.xzise.qukkiz.questions;

import de.xzise.qukkiz.QukkizSettings;

public abstract class Question implements QuestionInterface {

    public final String question;
    protected final QukkizSettings settings;
    private final int maximumHints;

    protected Question(String question, QukkizSettings settings, int maximumHints) {
        this.question = question;
        this.settings = settings;
        this.maximumHints = maximumHints;
    }

    protected Question(String question, QukkizSettings settings) {
        this(question, settings, -1);
    }

    @Override
    public String getQuestion() {
        return this.question;
    }

    @Override
    public int getMaximumHints() {
        return this.maximumHints;
    }

    public static double parseAnswerTest(boolean bool) {
        if (bool) {
            return 0;
        } else {
            return Double.NaN;
        }
    }

    public static boolean parseAnswerTest(double dbl) {
        if (dbl == Double.NaN || dbl != 0.0) {
            return false;
        } else {
            return true;
        }
    }
}
