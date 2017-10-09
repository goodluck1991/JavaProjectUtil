package com.util;

import java.util.*;

/**
 * @Author: JiaoGuojun
 * @Description:
 * @Date: Created in 13:55 2017/10/9
 */
public class StringUtil {
    private static final String FOLDER_SEPARATOR = "/";

    private static final char EXTENSION_SEPARATOR = '.';

    /**
     * 去掉字符串前后空格
     * @param obj
     * @return
     */
    public static String trim(Object obj){
        return null == obj ? "" : obj.toString().trim();
    }

    /**
     * 判断字符串为空
     * @param str
     * @return
     */
    public static boolean isEmpty(Object str) {
        return (str == null || "".equals(trim(str)));
    }

    /**
     * 判断字符串不为空
     * @param str
     * @return
     */
    public static boolean isNOtEmpty(Object str) {
        return !isEmpty(str);
    }

    /**
     * 判断字符串长度是否大于0
     * @param str
     * @return
     */
    public static boolean hasLength(CharSequence str) {
        return (str != null && str.length() > 0);
    }

    /**
     * 判断字符串长度是否大于0
     * @param str
     * @return
     */
    public static boolean hasLength(String str) {
        return hasLength((CharSequence) str);
    }

    /**
     * 字符长中包含字符
     * isWhitespace() 方法用于判断指定字符是否为空白字符，空白符包含：空格、tab键、换行符
     * @param str
     * @return
     */
    public static boolean hasText(CharSequence str) {
        if (!hasLength(str)) {
            return false;
        }
        int strLen = str.length();
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasText(String str) {
        return hasText((CharSequence) str);
    }

    /**
     * 判断字符串是否包含空白字符
     * @param str
     * @return
     */
    public static boolean containsWhitespace(CharSequence str) {
        if (!hasLength(str)) {
            return false;
        }
        int strLen = str.length();
        for (int i = 0; i < strLen; i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsWhitespace(String str) {
        return containsWhitespace((CharSequence) str);
    }

    /**
     * 去掉字符串前后空白字符，空白符包含：空格、tab键、换行符。
     * @param str
     * @return
     */
    public static String trimWhitespace(String str) {
        if (!hasLength(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() > 0 && Character.isWhitespace(sb.charAt(0))) {
            sb.deleteCharAt(0);
        }
        while (sb.length() > 0 && Character.isWhitespace(sb.charAt(sb.length() - 1))) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /**
     * 去掉所有空白字符
     * @param str
     * @return
     */
    public static String trimAllWhitespace(String str) {
        if (!hasLength(str)) {
            return str;
        }
        int len = str.length();
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (!Character.isWhitespace(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * 去掉开头空白字符
     * @param str
     * @return
     */
    public static String trimLeadingWhitespace(String str) {
        if (!hasLength(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() > 0 && Character.isWhitespace(sb.charAt(0))) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    /**
     * 去掉结尾空白字符
     * @param str
     * @return
     */
    public static String trimTrailingWhitespace(String str) {
        if (!hasLength(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() > 0 && Character.isWhitespace(sb.charAt(sb.length() - 1))) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /**
     * 去掉开头某个字符
     * @param str
     * @param leadingCharacter
     * @return
     */
    public static String trimLeadingCharacter(String str, char leadingCharacter) {
        if (!hasLength(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() > 0 && sb.charAt(0) == leadingCharacter) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    /**
     * 去掉结尾某个字符
     * @param str
     * @param trailingCharacter
     * @return
     */
    public static String trimTrailingCharacter(String str, char trailingCharacter) {
        if (!hasLength(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == trailingCharacter) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }


    /**
     * 忽略大小写,判断字符串str是否以prefix开头
     * @param str
     * @param prefix
     * @return
     */
    public static boolean startsWithIgnoreCase(String str, String prefix) {
        if (str == null || prefix == null) {
            return false;
        }
        if (str.startsWith(prefix)) {
            return true;
        }
        if (str.length() < prefix.length()) {
            return false;
        }
        String lcStr = str.substring(0, prefix.length()).toLowerCase();
        String lcPrefix = prefix.toLowerCase();
        return lcStr.equals(lcPrefix);
    }

    /**
     * 忽略大小写,判断字符串str是否以prefix结尾
     * @param str
     * @param suffix
     * @return
     */
    public static boolean endsWithIgnoreCase(String str, String suffix) {
        if (str == null || suffix == null) {
            return false;
        }
        if (str.endsWith(suffix)) {
            return true;
        }
        if (str.length() < suffix.length()) {
            return false;
        }

        String lcStr = str.substring(str.length() - suffix.length()).toLowerCase();
        String lcSuffix = suffix.toLowerCase();
        return lcStr.equals(lcSuffix);
    }

    /**
     * 判断字符串str从下标index开始比较是否字符串subString
     * @param str
     * @param index
     * @param substring
     * @return
     */
    public static boolean substringMatch(CharSequence str, int index, CharSequence substring) {
        for (int j = 0; j < substring.length(); j++) {
            int i = index + j;
            if (i >= str.length() || str.charAt(i) != substring.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 字符串str中包含sub字符串个数
     * @param str
     * @param sub
     * @return
     */
    public static int countOccurrencesOf(String str, String sub) {
        if (str == null || sub == null || str.length() == 0 || sub.length() == 0) {
            return 0;
        }
        int count = 0;
        int pos = 0;
        int idx;
        while ((idx = str.indexOf(sub, pos)) != -1) {
            ++count;
            pos = idx + sub.length();
        }
        return count;
    }

    /**
     * 把字符串inString中的所有oldPattern替换newPattern
     * @param inString
     * @param oldPattern
     * @param newPattern
     * @return
     */
    public static String replace(String inString, String oldPattern, String newPattern) {
        if (!hasLength(inString) || !hasLength(oldPattern) || newPattern == null) {
            return inString;
        }
        StringBuilder sb = new StringBuilder();
        int pos = 0; // our position in the old string
        int index = inString.indexOf(oldPattern);
        // the index of an occurrence we've found, or -1
        int patLen = oldPattern.length();
        while (index >= 0) {
            sb.append(inString.substring(pos, index));
            sb.append(newPattern);
            pos = index + patLen;
            index = inString.indexOf(oldPattern, pos);
        }
        sb.append(inString.substring(pos));
        // remember to append any characters to the right of a match
        return sb.toString();
    }

    public static String delete(String inString, String pattern) {
        return replace(inString, pattern, "");
    }

    /**
     * 去掉字符串inString字符串中所有在字符串charsToDelete中出现的字符
     * @param inString
     * @param charsToDelete
     * @return
     */
    public static String deleteAny(String inString, String charsToDelete) {
        if (!hasLength(inString) || !hasLength(charsToDelete)) {
            return inString;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inString.length(); i++) {
            char c = inString.charAt(i);
            if (charsToDelete.indexOf(c) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }


    //---------------------------------------------------------------------
    // Convenience methods for working with formatted Strings
    //---------------------------------------------------------------------

    /**
     * 字符串加引号并返回
     * @param str
     * @return
     */
    public static String quote(String str) {
        return (str != null ? "'" + str + "'" : null);
    }

    /**
     * 如果为字符串加引号返回,否则返回对象
     * @param obj
     * @return
     */
    public static Object quoteIfString(Object obj) {
        return (obj instanceof String ? quote((String) obj) : obj);
    }

    /**
     * 获取后缀名 例如:file.zip 返回zip
     * @param qualifiedName
     * @return
     */
    public static String unqualify(String qualifiedName) {
        return unqualify(qualifiedName, '.');
    }

    /**
     * 截取字符串
     * @param qualifiedName
     * @param separator
     * @return
     */
    public static String unqualify(String qualifiedName, char separator) {
        return qualifiedName.substring(qualifiedName.lastIndexOf(separator) + 1);
    }

    /**
     * 首字母大写
     * @param str
     * @return
     */
    public static String capitalize(String str) {
        return changeFirstCharacterCase(str, true);
    }

    /**
     * 首字母小写
     * @param str
     * @return
     */
    public static String uncapitalize(String str) {
        return changeFirstCharacterCase(str, false);
    }

    /**
     * 改变字符串首字母大小写
     * @param str
     * @param capitalize
     * @return
     */
    private static String changeFirstCharacterCase(String str, boolean capitalize) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        if (capitalize) {
            sb.append(Character.toUpperCase(str.charAt(0)));
        }
        else {
            sb.append(Character.toLowerCase(str.charAt(0)));
        }
        sb.append(str.substring(1));
        return sb.toString();
    }

    /**
     * 获取文件名
     * @param path
     * @return
     */
    public static String getFilename(String path) {
        if (path == null) {
            return null;
        }
        int separatorIndex = path.lastIndexOf(FOLDER_SEPARATOR);
        return (separatorIndex != -1 ? path.substring(separatorIndex + 1) : path);
    }

    /**
     * 获取文件后缀名
     * @param path
     * @return
     */
    public static String getFilenameExtension(String path) {
        if (path == null) {
            return null;
        }
        int extIndex = path.lastIndexOf(EXTENSION_SEPARATOR);
        if (extIndex == -1) {
            return null;
        }
        int folderIndex = path.lastIndexOf(FOLDER_SEPARATOR);
        if (folderIndex > extIndex) {
            return null;
        }
        return path.substring(extIndex + 1);
    }

    /**
     * e.g. "mypath/myfile.txt" -> "mypath/myfile".
     * @return the path with stripped filename extension,
     * or {@code null} if none
     */
    public static String stripFilenameExtension(String path) {
        if (path == null) {
            return null;
        }
        int extIndex = path.lastIndexOf(EXTENSION_SEPARATOR);
        if (extIndex == -1) {
            return path;
        }
        int folderIndex = path.lastIndexOf(FOLDER_SEPARATOR);
        if (folderIndex > extIndex) {
            return path;
        }
        return path.substring(0, extIndex);
    }

    /**
     * 拼接路径
     * @param path
     * @param relativePath
     * @return
     */
    public static String applyRelativePath(String path, String relativePath) {
        int separatorIndex = path.lastIndexOf(FOLDER_SEPARATOR);
        if (separatorIndex != -1) {
            String newPath = path.substring(0, separatorIndex);
            if (!relativePath.startsWith(FOLDER_SEPARATOR)) {
                newPath += FOLDER_SEPARATOR;
            }
            return newPath + relativePath;
        }
        else {
            return relativePath;
        }
    }

    /**
     * 特定的地理、政治和文化地区
     * @param localeString
     * @return
     */
    public static Locale parseLocaleString(String localeString) {
        String[] parts = tokenizeToStringArray(localeString, "_ ", false, false);
        String language = (parts.length > 0 ? parts[0] : "");
        String country = (parts.length > 1 ? parts[1] : "");
        validateLocalePart(language);
        validateLocalePart(country);
        String variant = "";
        if (parts.length > 2) {
            // There is definitely a variant, and it is everything after the country
            // code sans the separator between the country code and the variant.
            int endIndexOfCountryCode = localeString.indexOf(country, language.length()) + country.length();
            // Strip off any leading '_' and whitespace, what's left is the variant.
            variant = trimLeadingWhitespace(localeString.substring(endIndexOfCountryCode));
            if (variant.startsWith("_")) {
                variant = trimLeadingCharacter(variant, '_');
            }
        }
        return (language.length() > 0 ? new Locale(language, country, variant) : null);
    }

    /**
     * 校验字符串localePart是否都为数字字母和_以及空格组成
     * @param localePart
     */
    public static void validateLocalePart(String localePart) {
        for (int i = 0; i < localePart.length(); i++) {
            char ch = localePart.charAt(i);
            if (ch != '_' && ch != ' ' && !Character.isLetterOrDigit(ch)) {
                throw new IllegalArgumentException(
                        "Locale part \"" + localePart + "\" contains invalid characters");
            }
        }
    }

    /**
     * Determine the RFC 3066 compliant language tag,
     * as used for the HTTP "Accept-Language" header.
     * @param locale the Locale to transform to a language tag
     * @return the RFC 3066 compliant language tag as {@code String}
     */
    public static String toLanguageTag(Locale locale) {
        return locale.getLanguage() + (hasText(locale.getCountry()) ? "-" + locale.getCountry() : "");
    }

    /**
     * Parse the given {@code timeZoneString} value into a {@link TimeZone}.
     * @param timeZoneString the time zone {@code String}, following {@link TimeZone#getTimeZone(String)}
     * but throwing {@link IllegalArgumentException} in case of an invalid time zone specification
     * @return a corresponding {@link TimeZone} instance
     * @throws IllegalArgumentException in case of an invalid time zone specification
     */
    public static TimeZone parseTimeZoneString(String timeZoneString) {
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneString);
        if ("GMT".equals(timeZone.getID()) && !timeZoneString.startsWith("GMT")) {
            // We don't want that GMT fallback...
            throw new IllegalArgumentException("Invalid time zone specification '" + timeZoneString + "'");
        }
        return timeZone;
    }


    //---------------------------------------------------------------------
    // Convenience methods for working with String arrays
    //---------------------------------------------------------------------

    /**
     * 数组添加元素
     * @param array
     * @param str
     * @return
     */
    public static String[] addStringToArray(String[] array, String str) {
        if (ObjectUtil.isEmpty(array)) {
            return new String[] {str};
        }
        String[] newArr = new String[array.length + 1];
        System.arraycopy(array, 0, newArr, 0, array.length);
        newArr[array.length] = str;
        return newArr;
    }

    /**
     * 两个数组合并成一个数组
     * @param array1
     * @param array2
     * @return
     */
    public static String[] concatenateStringArrays(String[] array1, String[] array2) {
        if (ObjectUtil.isEmpty(array1)) {
            return array2;
        }
        if (ObjectUtil.isEmpty(array2)) {
            return array1;
        }
        String[] newArr = new String[array1.length + array2.length];
        System.arraycopy(array1, 0, newArr, 0, array1.length);
        System.arraycopy(array2, 0, newArr, array1.length, array2.length);
        return newArr;
    }

    /**
     * 两个数组合并成一个数组,数组元素为两个数组的并集
     * @param array1
     * @param array2
     * @return
     */
    public static String[] mergeStringArrays(String[] array1, String[] array2) {
        if (ObjectUtil.isEmpty(array1)) {
            return array2;
        }
        if (ObjectUtil.isEmpty(array2)) {
            return array1;
        }
        List<String> result = new ArrayList<String>();
        result.addAll(Arrays.asList(array1));
        for (String str : array2) {
            if (!result.contains(str)) {
                result.add(str);
            }
        }
        return toStringArray(result);
    }

    /**
     * 数组升序排序
     * @param array
     * @return
     */
    public static String[] sortStringArray(String[] array) {
        if (ObjectUtil.isEmpty(array)) {
            return new String[0];
        }
        Arrays.sort(array);
        return array;
    }

    /**
     * 集合转换成数组
     * @param collection
     * @return
     */
    public static String[] toStringArray(Collection<String> collection) {
        if (collection == null) {
            return null;
        }
        return collection.toArray(new String[collection.size()]);
    }

    /**
     * 枚举转换成数组
     * @param enumeration
     * @return
     */
    public static String[] toStringArray(Enumeration<String> enumeration) {
        if (enumeration == null) {
            return null;
        }
        List<String> list = Collections.list(enumeration);
        return list.toArray(new String[list.size()]);
    }

    /**
     * 对数组中的所有元素进行trim()操作
     * @param array
     * @return
     */
    public static String[] trimArrayElements(String[] array) {
        if (ObjectUtil.isEmpty(array)) {
            return new String[0];
        }
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            String element = array[i];
            result[i] = (element != null ? element.trim() : null);
        }
        return result;
    }

    /**
     * 移除数组中重复元素
     * @param array
     * @return
     */
    public static String[] removeDuplicateStrings(String[] array) {
        if (ObjectUtil.isEmpty(array)) {
            return array;
        }
        Set<String> set = new LinkedHashSet<String>();
        for (String element : array) {
            set.add(element);
        }
        return toStringArray(set);
    }

    /**
     * Split a {@code String} at the first occurrence of the delimiter.
     * Does not include the delimiter in the result.
     * @param toSplit the string to split
     * @param delimiter to split the string up with
     * @return a two element array with index 0 being before the delimiter, and
     * index 1 being after the delimiter (neither element includes the delimiter);
     * or {@code null} if the delimiter wasn't found in the given input {@code String}
     */
    public static String[] split(String toSplit, String delimiter) {
        if (!hasLength(toSplit) || !hasLength(delimiter)) {
            return null;
        }
        int offset = toSplit.indexOf(delimiter);
        if (offset < 0) {
            return null;
        }
        String beforeDelimiter = toSplit.substring(0, offset);
        String afterDelimiter = toSplit.substring(offset + delimiter.length());
        return new String[] {beforeDelimiter, afterDelimiter};
    }

    /**
     * Take an array of strings and split each element based on the given delimiter.
     * A {@code Properties} instance is then generated, with the left of the
     * delimiter providing the key, and the right of the delimiter providing the value.
     * <p>Will trim both the key and value before adding them to the
     * {@code Properties} instance.
     * @param array the array to process
     * @param delimiter to split each element using (typically the equals symbol)
     * @return a {@code Properties} instance representing the array contents,
     * or {@code null} if the array to process was {@code null} or empty
     */
    public static Properties splitArrayElementsIntoProperties(String[] array, String delimiter) {
        return splitArrayElementsIntoProperties(array, delimiter, null);
    }

    /**
     * Take an array of strings and split each element based on the given delimiter.
     * A {@code Properties} instance is then generated, with the left of the
     * delimiter providing the key, and the right of the delimiter providing the value.
     * <p>Will trim both the key and value before adding them to the
     * {@code Properties} instance.
     * @param array the array to process
     * @param delimiter to split each element using (typically the equals symbol)
     * @param charsToDelete one or more characters to remove from each element
     * prior to attempting the split operation (typically the quotation mark
     * symbol), or {@code null} if no removal should occur
     * @return a {@code Properties} instance representing the array contents,
     * or {@code null} if the array to process was {@code null} or empty
     * 数组转换成Properties键值对
     * 例如:new String[] {kay-value}
     *      结果为Properties.setProperty(kay,value)
     */
    public static Properties splitArrayElementsIntoProperties(
            String[] array, String delimiter, String charsToDelete) {
        if (ObjectUtil.isEmpty(array)) {
            return null;
        }
        Properties result = new Properties();
        for (String element : array) {
            if (charsToDelete != null) {
                element = deleteAny(element, charsToDelete);
            }
            String[] splittedElement = split(element, delimiter);
            if (splittedElement == null) {
                continue;
            }
            result.setProperty(splittedElement[0].trim(), splittedElement[1].trim());
        }
        return result;
    }

    /**
     * Tokenize the given {@code String} into a {@code String} array via a
     * {@link StringTokenizer}.
     * <p>Trims tokens and omits empty tokens.
     * <p>The given {@code delimiters} string can consist of any number of
     * delimiter characters. Each of those characters can be used to separate
     * tokens. A delimiter is always a single character; for multi-character
     * delimiters, consider using {@link #delimitedListToStringArray}.
     * @param str the {@code String} to tokenize
     * @param delimiters the delimiter characters, assembled as a {@code String}
     * (each of the characters is individually considered as a delimiter)
     * @return an array of the tokens
     * @see java.util.StringTokenizer
     * @see String#trim()
     * @see #delimitedListToStringArray
     */
    public static String[] tokenizeToStringArray(String str, String delimiters) {
        return tokenizeToStringArray(str, delimiters, true, true);
    }

    /**
     * Tokenize the given {@code String} into a {@code String} array via a
     * {@link StringTokenizer}.
     * <p>The given {@code delimiters} string can consist of any number of
     * delimiter characters. Each of those characters can be used to separate
     * tokens. A delimiter is always a single character; for multi-character
     * delimiters, consider using {@link #delimitedListToStringArray}.
     * @param str the {@code String} to tokenize
     * @param delimiters the delimiter characters, assembled as a {@code String}
     * (each of the characters is individually considered as a delimiter)
     * @param trimTokens trim the tokens via {@link String#trim()}
     * @param ignoreEmptyTokens omit empty tokens from the result array
     * (only applies to tokens that are empty after trimming; StringTokenizer
     * will not consider subsequent delimiters as token in the first place).
     * @return an array of the tokens ({@code null} if the input {@code String}
     * was {@code null})
     * @see java.util.StringTokenizer
     * @see String#trim()
     * @see #delimitedListToStringArray
     * 字符串转换成数组
     */
    public static String[] tokenizeToStringArray(
            String str, String delimiters, boolean trimTokens, boolean ignoreEmptyTokens) {

        if (str == null) {
            return null;
        }
        StringTokenizer st = new StringTokenizer(str, delimiters);
        List<String> tokens = new ArrayList<String>();
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (trimTokens) {
                token = token.trim();
            }
            if (!ignoreEmptyTokens || token.length() > 0) {
                tokens.add(token);
            }
        }
        return toStringArray(tokens);
    }

    /**
     * Take a {@code String} that is a delimited list and convert it into a
     * {@code String} array.
     * <p>A single {@code delimiter} may consist of more than one character,
     * but it will still be considered as a single delimiter string, rather
     * than as bunch of potential delimiter characters, in contrast to
     * {@link #tokenizeToStringArray}.
     * @param str the input {@code String}
     * @param delimiter the delimiter between elements (this is a single delimiter,
     * rather than a bunch individual delimiter characters)
     * @return an array of the tokens in the list
     * @see #tokenizeToStringArray
     */
    public static String[] delimitedListToStringArray(String str, String delimiter) {
        return delimitedListToStringArray(str, delimiter, null);
    }

    /**
     * Take a {@code String} that is a delimited list and convert it into
     * a {@code String} array.
     * <p>A single {@code delimiter} may consist of more than one character,
     * but it will still be considered as a single delimiter string, rather
     * than as bunch of potential delimiter characters, in contrast to
     * {@link #tokenizeToStringArray}.
     * @param str the input {@code String}
     * @param delimiter the delimiter between elements (this is a single delimiter,
     * rather than a bunch individual delimiter characters)
     * @param charsToDelete a set of characters to delete; useful for deleting unwanted
     * line breaks: e.g. "\r\n\f" will delete all new lines and line feeds in a {@code String}
     * @return an array of the tokens in the list
     * @see #tokenizeToStringArray
     */
    public static String[] delimitedListToStringArray(String str, String delimiter, String charsToDelete) {
        if (str == null) {
            return new String[0];
        }
        if (delimiter == null) {
            return new String[] {str};
        }
        List<String> result = new ArrayList<String>();
        if ("".equals(delimiter)) {
            for (int i = 0; i < str.length(); i++) {
                result.add(deleteAny(str.substring(i, i + 1), charsToDelete));
            }
        }
        else {
            int pos = 0;
            int delPos;
            while ((delPos = str.indexOf(delimiter, pos)) != -1) {
                result.add(deleteAny(str.substring(pos, delPos), charsToDelete));
                pos = delPos + delimiter.length();
            }
            if (str.length() > 0 && pos <= str.length()) {
                // Add rest of String, but not in case of empty input.
                result.add(deleteAny(str.substring(pos), charsToDelete));
            }
        }
        return toStringArray(result);
    }

    /**
     * Convert a comma delimited list (e.g., a row from a CSV file) into an
     * array of strings.
     * @param str the input {@code String}
     * @return an array of strings, or the empty array in case of empty input
     */
    public static String[] commaDelimitedListToStringArray(String str) {
        return delimitedListToStringArray(str, ",");
    }

    /**
     * Convert a comma delimited list (e.g., a row from a CSV file) into a set.
     * <p>Note that this will suppress duplicates, and as of 4.2, the elements in
     * the returned set will preserve the original order in a {@link LinkedHashSet}.
     * @param str the input {@code String}
     * @return a set of {@code String} entries in the list
     * @see #removeDuplicateStrings(String[])
     */
    public static Set<String> commaDelimitedListToSet(String str) {
        Set<String> set = new LinkedHashSet<String>();
        String[] tokens = commaDelimitedListToStringArray(str);
        for (String token : tokens) {
            set.add(token);
        }
        return set;
    }




    /**
     * Convert a {@code String} array into a delimited {@code String} (e.g. CSV).
     * <p>Useful for {@code toString()} implementations.
     * @param arr the array to display
     * @param delim the delimiter to use (typically a ",")
     * @return the delimited {@code String}
     */
    public static String arrayToDelimitedString(Object[] arr, String delim) {
        if (ObjectUtil.isEmpty(arr)) {
            return "";
        }
        if (arr.length == 1) {
            return ObjectUtil.nullSafeToString(arr[0]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                sb.append(delim);
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }

    /**
     * Convert a {@code String} array into a comma delimited {@code String}
     * (i.e., CSV).
     * <p>Useful for {@code toString()} implementations.
     * @param arr the array to display
     * @return the delimited {@code String}
     */
    public static String arrayToCommaDelimitedString(Object[] arr) {
        return arrayToDelimitedString(arr, ",");
    }
}
