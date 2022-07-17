package com.example.assignmentspringboot.util;

import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Pattern;

public class StringHelper {
    private static final Pattern NONLATIN = Pattern.compile("[^\\w-]");
    private static final Pattern WHITESPACE = Pattern.compile("[\\s]");

    public static String toSlug(String input) {
        String nowhitespace = WHITESPACE.matcher(input).replaceAll("-");
        String normalized = Normalizer.normalize(nowhitespace, Normalizer.Form.NFD);
        String slug = NONLATIN.matcher(normalized).replaceAll("");
        return slug.toLowerCase(Locale.ENGLISH);
    }

    public static void main(String[] args) {
        System.out.println(toSlug("Hello world, Vietnam, Malay"));
    }
}
