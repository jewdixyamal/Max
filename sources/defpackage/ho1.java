package defpackage;

import ru.ok.android.externcalls.sdk.util.CallsThreadUtilsKt;

/* renamed from: ho1  reason: default package */
public final /* synthetic */ class ho1 implements hnc, grd, xha {
    public final /* synthetic */ int a;
    public final /* synthetic */ k56 b;

    public /* synthetic */ ho1(int i, k56 k56) {
        this.a = i;
        this.b = k56;
    }

    public void I(yha yha) {
        k56 k56 = this.b;
        if (k56 != null) {
            k56.invoke();
        }
    }

    public void b() {
        int i = this.a;
        k56 k56 = this.b;
        switch (i) {
            case 0:
                no1.setPositiveAction$lambda$70$lambda$69(k56);
                return;
            default:
                no1.setNegativeAction$lambda$68$lambda$67(k56);
                return;
        }
    }

    public void j(nqd nqd) {
        CallsThreadUtilsKt.executeOnIoThread$lambda$0(this.b, nqd);
    }
}
