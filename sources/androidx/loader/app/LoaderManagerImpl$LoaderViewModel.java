package androidx.loader.app;

class LoaderManagerImpl$LoaderViewModel extends qnf {
    public static final a d = new Object();
    public final kvd b = new kvd();
    public boolean c = false;

    public final void d() {
        kvd kvd = this.b;
        int i = kvd.c;
        int i2 = 0;
        while (i2 < i) {
            mo7 mo7 = (mo7) kvd.b[i2];
            rgg rgg = mo7.n;
            rgg.a();
            rgg.d = true;
            no7 no7 = mo7.p;
            if (no7 != null) {
                mo7.j(no7);
                if (no7.b) {
                    no7.a.getClass();
                }
            }
            mo7 mo72 = rgg.b;
            if (mo72 == null) {
                throw new IllegalStateException("No listener register");
            } else if (mo72 == mo7) {
                rgg.b = null;
                if (no7 != null) {
                    boolean z = no7.b;
                }
                rgg.e = true;
                rgg.c = false;
                rgg.d = false;
                rgg.f = false;
                i2++;
            } else {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
        }
        int i3 = kvd.c;
        Object[] objArr = kvd.b;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        kvd.c = 0;
    }
}
