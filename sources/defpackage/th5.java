package defpackage;

import java.io.File;

/* renamed from: th5  reason: default package */
public final /* synthetic */ class th5 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi5 b;

    public /* synthetic */ th5(bi5 bi5, int i) {
        this.a = i;
        this.b = bi5;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                File file = new File(bi5.d((String) this.b.g.getValue(), false));
                v3c.g(file);
                return file;
            default:
                return new File(bi5.d((String) this.b.g.getValue(), true));
        }
    }
}
