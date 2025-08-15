package defpackage;

/* renamed from: n5a  reason: default package */
public final class n5a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s5a b;

    public /* synthetic */ n5a(s5a s5a, int i) {
        this.a = i;
        this.b = s5a;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                s5a s5a = this.b;
                k56 k56 = s5a.C0;
                if (k56 != null) {
                    k56.invoke();
                }
                s5a.invalidate();
                return;
            default:
                s5a s5a2 = this.b;
                k56 k562 = s5a2.C0;
                if (k562 != null) {
                    k562.invoke();
                }
                s5a2.invalidate();
                return;
        }
    }
}
