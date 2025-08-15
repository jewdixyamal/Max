package defpackage;

import android.graphics.Bitmap;

/* renamed from: bo0  reason: default package */
public final class bo0 extends mw7 {
    public final /* synthetic */ int g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bo0(int i, int i2) {
        super(i);
        this.g = i2;
    }

    public Object a(Object obj) {
        switch (this.g) {
            case 3:
                qwd qwd = (qwd) obj;
                return qjd.b(qwd.a, qwd.b);
            default:
                return super.a(obj);
        }
    }

    public void b(boolean z, Object obj, Object obj2, Object obj3) {
        switch (this.g) {
            case 1:
                String str = (String) obj;
                Bitmap bitmap = (Bitmap) obj3;
                ((Bitmap) obj2).recycle();
                return;
            default:
                return;
        }
    }

    public int h(Object obj) {
        switch (this.g) {
            case 0:
                int d = qo0.d((Bitmap) obj);
                if (d < 1) {
                    return 1;
                }
                return d;
            default:
                return super.h(obj);
        }
    }
}
