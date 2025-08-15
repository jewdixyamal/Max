package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;

/* renamed from: gh5  reason: default package */
public final class gh5 extends vrd {
    public static final gh5 b = new vrd();

    public final j64 c() {
        return new j64(new zf3(29), new fh5(0));
    }

    public final k64 d(Bundle bundle) {
        long D = i24.D("chat_id", bundle);
        long D2 = i24.D("message_id", bundle);
        String string = bundle.getString("attach_id");
        long D3 = i24.D("file_id", bundle);
        String F = i24.F("file_name", bundle);
        Parcelable parcelable = bundle.getParcelable("file_url");
        if (parcelable != null) {
            return new eh5(D, D2, string, D3, F, (Uri) parcelable);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void e(urd urd) {
        i64.a(urd, ":dialogs/file-download-warning", new String[]{"chat_id", "message_id", "file_id", "file_name"}, Collections.singleton("file_url"), 0, 12);
    }
}
