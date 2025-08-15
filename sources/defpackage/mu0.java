package defpackage;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* renamed from: mu0  reason: default package */
public abstract class mu0 {
    public static final void a(Bundle bundle, String str, Size size) {
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
