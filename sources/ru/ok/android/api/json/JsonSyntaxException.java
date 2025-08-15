package ru.ok.android.api.json;

import java.io.IOException;
import java.util.Locale;

public class JsonSyntaxException extends IOException {
    /* JADX WARNING: type inference failed for: r0v1, types: [ru.ok.android.api.json.JsonSyntaxException, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r0v2, types: [ru.ok.android.api.json.JsonSyntaxException, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r6v3, types: [ru.ok.android.api.json.JsonSyntaxException, java.io.IOException] */
    public static JsonSyntaxException a(long j, String str, int i) {
        if (i >= 0) {
            return i < 31 ? new IOException(String.format(Locale.US, "Unexpected char (U+%04x) at pos %d near `%s`", new Object[]{Integer.valueOf(i), Long.valueOf(j), str})) : new IOException(String.format(Locale.US, "Unexpected char '%s' (U+%04x) at pos %d near `%s`", new Object[]{Character.valueOf((char) i), Integer.valueOf(i), Long.valueOf(j), str}));
        }
        Locale locale = Locale.US;
        StringBuilder j2 = z7b.j("Unexpected EOF at pos ", j, " after `", str);
        j2.append("`");
        return new IOException(j2.toString());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [ru.ok.android.api.json.JsonSyntaxException, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r7v3, types: [ru.ok.android.api.json.JsonSyntaxException, java.io.IOException] */
    public static JsonSyntaxException b(long j, String str, int i) {
        if (i == 0) {
            Locale locale = Locale.US;
            StringBuilder j2 = z7b.j("Unexpected eof at pos ", j, " after `", str);
            j2.append("`");
            return new IOException(j2.toString());
        }
        String U = z7.U(i);
        Locale locale2 = Locale.US;
        return new IOException("Unexpected " + U + " at pos " + j + " near `" + str + "`");
    }
}
