package defpackage;

/* renamed from: e63  reason: default package */
public final class e63 extends rd7 implements m56 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e63(int i) {
        super(1);
        this.a = i;
    }

    public final Object invoke(Object obj) {
        ((Number) obj).intValue();
        throw new IndexOutOfBoundsException(au1.h(new StringBuilder("Collection doesn't contain element at index "), this.a, '.'));
    }
}
