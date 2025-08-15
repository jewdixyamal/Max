package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import androidx.fragment.app.b;

/* renamed from: y06  reason: default package */
public final /* synthetic */ class y06 implements tj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ y06(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Configuration configuration = (Configuration) obj;
                this.b.E0.D();
                return;
            default:
                Intent intent = (Intent) obj;
                this.b.E0.D();
                return;
        }
    }
}
