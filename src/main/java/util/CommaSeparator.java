package util;

import static java.util.Collections.addAll;

import exception.CommaNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class CommaSeparator {

    private static final String COMMA = ",";

    public static List<String> sliceNameByComma(final String names) {
        validateComma(names);

        return getSplitName(names);
    }

    private static List<String> getSplitName(final String names) {
        List<String> splitNames = new ArrayList<>();

        addAll(splitNames, names.split(COMMA));

        return splitNames;
    }

    private static void validateComma(final String names) {
        if (!names.contains(COMMA)) {
            throw new CommaNotFoundException("[ERROR] 쉼표로 이름을 구분해주세요.");
        }
    }
}
