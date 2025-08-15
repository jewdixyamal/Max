package defpackage;

import android.app.RemoteInput;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* renamed from: vfc  reason: default package */
public final class vfc {
    public final String a;
    public final CharSequence b;
    public final CharSequence[] c;
    public final boolean d;
    public final int e;
    public final Bundle f;
    public final Set g;

    public vfc(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, HashSet hashSet) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequenceArr;
        this.d = z;
        this.e = i;
        this.f = bundle;
        this.g = hashSet;
        if (i == 2 && !z) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput a(vfc vfc) {
        RemoteInput.Builder addExtras = new RemoteInput.Builder(vfc.a).setLabel(vfc.b).setChoices(vfc.c).setAllowFreeFormInput(vfc.d).addExtras(vfc.f);
        Set<String> set = vfc.g;
        if (set != null) {
            for (String d2 : set) {
                tfc.d(addExtras, d2, true);
            }
        }
        ufc.b(addExtras, vfc.e);
        return addExtras.build();
    }
}
