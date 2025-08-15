package defpackage;

import android.webkit.MimeTypeMap;
import java.util.Map;

/* renamed from: ga9  reason: default package */
public abstract class ga9 {
    public static final MimeTypeMap a = MimeTypeMap.getSingleton();
    public static final Map b = dx6.b("heif", "image/heif", "heic", "image/heic");

    static {
        dx6.b("image/heif", "heif", "image/heic", "heic");
    }
}
