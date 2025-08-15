package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: bnc  reason: default package */
public final class bnc extends OrientationEventListener {
    public int a = -1;
    public final /* synthetic */ k8g b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bnc(k8g k8g, Context context) {
        super(context);
        this.b = k8g;
    }

    public final void onOrientationChanged(int i) {
        ArrayList arrayList;
        if (i != -1) {
            int i2 = (i >= 315 || i < 45) ? 0 : i >= 225 ? 1 : i >= 135 ? 2 : 3;
            if (this.a != i2) {
                this.a = i2;
                synchronized (this.b.a) {
                    arrayList = new ArrayList(((HashMap) this.b.c).values());
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        cnc cnc = (cnc) it.next();
                        cnc.getClass();
                        cnc.b.execute(new l40(i2, 15, cnc));
                    }
                }
            }
        }
    }
}
