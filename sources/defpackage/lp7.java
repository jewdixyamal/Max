package defpackage;

import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: lp7  reason: default package */
public final class lp7 extends o26 {
    public final ml0 f = new ml0((Object) null);
    public sd7 g;
    public final MediaMetadataRetriever h = new MediaMetadataRetriever();
    public final int i;
    public volatile long j;

    public lp7(hle hle, o45 o45, ti4 ti4) {
        super(hle, o45);
        vi4 b = ti4.b();
        int ordinal = b.ordinal();
        if (ordinal == 0) {
            this.i = 5;
        } else if (ordinal == 1) {
            this.i = 10;
        } else if (ordinal == 2) {
            this.i = 20;
        } else {
            throw new IllegalStateException("unknown performance class " + b);
        }
    }

    public final boolean b() {
        fef fef = this.e;
        if (fef != null) {
            Uri l = ((ok0) fef).l();
            int i2 = maf.a;
            String scheme = l.getScheme();
            if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
                return true;
            }
        }
        return false;
    }
}
