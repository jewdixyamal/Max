package defpackage;

import java.util.Locale;
import java.util.Map;

/* renamed from: ym8  reason: default package */
public abstract class ym8 {
    public static final Map a = mz7.a0(new kpa("mkv", "video/x-matroska"), new kpa("glb", "model/gltf-binary"));

    public static final String a(String str) {
        int E0 = w9e.E0(str, '.', 0, 6);
        String substring = (E0 < 0 || E0 == str.length() + -1) ? null : str.substring(E0 + 1);
        if (substring == null) {
            return null;
        }
        String lowerCase = substring.toLowerCase(Locale.US);
        String str2 = (String) ga9.b.get(lowerCase);
        if (str2 == null) {
            str2 = ga9.a.getMimeTypeFromExtension(lowerCase);
        }
        return str2 == null ? (String) a.get(lowerCase) : str2;
    }
}
