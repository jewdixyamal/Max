package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.List;

/* renamed from: nu9  reason: default package */
public final class nu9 {
    public final CharSequence a;
    public final long b;
    public final kua c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f;

    public nu9(CharSequence charSequence, long j, kua kua) {
        this.a = charSequence;
        this.b = j;
        this.c = kua;
    }

    public static Bundle[] a(List list) {
        Bundle[] bundleArr = new Bundle[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            nu9 nu9 = (nu9) list.get(i);
            nu9.getClass();
            Bundle bundle = new Bundle();
            CharSequence charSequence = nu9.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", nu9.b);
            kua kua = nu9.c;
            if (kua != null) {
                bundle.putCharSequence("sender", kua.a);
                bundle.putParcelable("sender_person", mu9.a(jua.b(kua)));
            }
            String str = nu9.e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = nu9.f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = nu9.d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }
}
