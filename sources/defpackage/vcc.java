package defpackage;

import android.media.MediaMuxer;
import android.net.Uri;
import java.io.File;

/* renamed from: vcc  reason: default package */
public final /* synthetic */ class vcc {
    public final /* synthetic */ hi5 a;

    public /* synthetic */ vcc(hi5 hi5) {
        this.a = hi5;
    }

    public final MediaMuxer a(int i, cy1 cy1) {
        Uri uri = Uri.EMPTY;
        hi5 hi5 = this.a;
        if (hi5 instanceof hi5) {
            File file = hi5.b.c;
            File parentFile = file.getParentFile();
            if (!(parentFile == null ? false : parentFile.exists() ? parentFile.isDirectory() : parentFile.mkdirs())) {
                file.getAbsolutePath();
            }
            MediaMuxer mediaMuxer = new MediaMuxer(file.getAbsolutePath(), i);
            ((adc) cy1.b).J = Uri.fromFile(file);
            return mediaMuxer;
        }
        throw new AssertionError("Invalid output options type: ".concat(hi5.getClass().getSimpleName()));
    }
}
