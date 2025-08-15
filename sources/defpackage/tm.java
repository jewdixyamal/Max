package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* renamed from: tm  reason: default package */
public final class tm extends yof {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tm(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void b() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                ((sm) obj).b.G0.setVisibility(0);
                return;
            case 1:
                dn dnVar = (dn) obj;
                dnVar.G0.setVisibility(0);
                if (dnVar.G0.getParent() instanceof View) {
                    WeakHashMap weakHashMap = zmf.a;
                    mmf.c((View) dnVar.G0.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void c() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                sm smVar = (sm) obj;
                smVar.b.G0.setAlpha(1.0f);
                dn dnVar = smVar.b;
                dnVar.J0.d((xof) null);
                dnVar.J0 = null;
                return;
            case 1:
                dn dnVar2 = (dn) obj;
                dnVar2.G0.setAlpha(1.0f);
                dnVar2.J0.d((xof) null);
                dnVar2.J0 = null;
                return;
            default:
                imc imc = (imc) obj;
                ((dn) imc.c).G0.setVisibility(8);
                dn dnVar3 = (dn) imc.c;
                PopupWindow popupWindow = dnVar3.H0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (dnVar3.G0.getParent() instanceof View) {
                    WeakHashMap weakHashMap = zmf.a;
                    mmf.c((View) dnVar3.G0.getParent());
                }
                dnVar3.G0.e();
                dnVar3.J0.d((xof) null);
                dnVar3.J0 = null;
                ViewGroup viewGroup = dnVar3.L0;
                WeakHashMap weakHashMap2 = zmf.a;
                mmf.c(viewGroup);
                return;
        }
    }
}
