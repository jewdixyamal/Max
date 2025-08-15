package defpackage;

import java.util.regex.Pattern;

/* renamed from: tf9  reason: default package */
public final class tf9 implements yua {
    public static final Pattern b = Pattern.compile("^[\\p{L}\\p{N}]+$");
    public final String a;

    public tf9(String str) {
        this.a = str.concat("_");
    }

    public final String a(Object obj) {
        String obj2 = obj.toString();
        if (b.matcher(obj2).matches()) {
            return this.a + obj;
        }
        throw new IllegalArgumentException(wg0.i("Invalid key: ", obj2));
    }
}
