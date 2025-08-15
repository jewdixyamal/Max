package defpackage;

/* renamed from: l85  reason: default package */
public final class l85 {
    public final rze a;
    public final int[] b;

    public l85(rze rze, int[] iArr) {
        if (iArr.length == 0) {
            z04.v("Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = rze;
        this.b = iArr;
    }
}
