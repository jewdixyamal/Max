package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(jcf jcf) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.a;
        boolean z = true;
        if (jcf.e(1)) {
            obj = jcf.h();
        }
        remoteActionCompat.a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.b;
        if (jcf.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((kcf) jcf).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (jcf.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((kcf) jcf).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) jcf.g(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (jcf.e(5)) {
            z2 = ((kcf) jcf).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (jcf.e(6)) {
            if (((kcf) jcf).e.readInt() == 0) {
                z = false;
            }
            z3 = z;
        }
        remoteActionCompat.f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, jcf jcf) {
        jcf.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        jcf.i(1);
        jcf.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        jcf.i(2);
        Parcel parcel = ((kcf) jcf).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        jcf.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        jcf.k(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        jcf.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        jcf.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
