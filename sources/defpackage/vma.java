package defpackage;

import java.util.RandomAccess;

/* renamed from: vma  reason: default package */
public final class vma extends x1 implements RandomAccess {
    public final aw0[] a;
    public final int[] b;

    public vma(aw0[] aw0Arr, int[] iArr) {
        this.a = aw0Arr;
        this.b = iArr;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof aw0) {
            return super.contains((aw0) obj);
        }
        return false;
    }

    public final Object get(int i) {
        return this.a[i];
    }

    public final int getSize() {
        return this.a.length;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof aw0) {
            return super.indexOf((aw0) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof aw0) {
            return super.lastIndexOf((aw0) obj);
        }
        return -1;
    }
}
