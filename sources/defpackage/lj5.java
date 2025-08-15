package defpackage;

import java.io.File;
import java.util.Iterator;

/* renamed from: lj5  reason: default package */
public final class lj5 implements c6d {
    public final File a;
    public final int b = 2;

    public lj5(File file) {
        this.a = file;
    }

    public final Iterator iterator() {
        return new jj5(this);
    }
}
