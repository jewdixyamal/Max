package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* renamed from: jg3  reason: default package */
public final class jg3 extends RecyclerView implements kre, g17 {
    public static final /* synthetic */ bc7[] c2;
    public boolean V1 = true;
    public fg3 W1;
    public final hg3 X1;
    public k56 Y1;
    public final hg3 Z1;
    public m56 a2;
    public final bud b2;

    static {
        Class<jg3> cls = jg3.class;
        c2 = new bc7[]{new oi9(cls, "state", "getState()Lone/me/sdk/codeinput/ConfirmSmsInputView$State;"), rh4.g(nec.a, cls, "countCells", "getCountCells()I")};
    }

    public jg3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        gg3 gg3 = gg3.SUCCESS;
        this.X1 = new hg3(this, 0);
        this.Y1 = new a5(context, 28);
        this.Z1 = new hg3(this, 1);
        this.b2 = new bud(lnf.b(this));
        setLayoutManager(new LinearLayoutManager(0, false));
        j(new kq(4));
    }

    public static ArrayList G0(jg3 jg3) {
        jg3.getClass();
        ArrayList arrayList = new ArrayList();
        int childCount = jg3.getChildCount();
        for (int i = 0; i < childCount; i++) {
            l17 H0 = jg3.H0(i);
            if (H0 != null) {
                arrayList.add(H0);
            }
        }
        return arrayList;
    }

    private final l17 getFirstEmptyInputController() {
        Object obj;
        Iterator it = G0(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ptd) ((l17) obj)).A().length() == 0) {
                break;
            }
        }
        return (l17) obj;
    }

    /* access modifiers changed from: private */
    public final void setInputsEnabled(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            l17 H0 = H0(i);
            if (H0 != null) {
                ptd ptd = (ptd) H0;
                eg3 eg3 = ptd.H0;
                if (!z && ((Boolean) ptd.I0.Y.invoke()).booleanValue()) {
                    mr0.I(eg3);
                }
                eg3.setClickable(z);
                eg3.setFocusable(z);
                eg3.setFocusableInTouchMode(z);
            }
        }
    }

    public final l17 H0(int i) {
        dec M = M(i);
        if (M instanceof l17) {
            return (l17) M;
        }
        return null;
    }

    public final boolean I0(int i) {
        return i >= 0 && i <= getCountCells();
    }

    public final void J0(int i, String str) {
        if (I0(i) && I0(str.length())) {
            int length = str.length();
            for (int i2 = i; i2 < length; i2++) {
                int i3 = i2 - i;
                l17 H0 = H0(i2);
                if (H0 != null) {
                    ((ptd) H0).B(String.valueOf(w9e.w0(i3, str)));
                }
            }
        }
    }

    public final boolean K0() {
        l17 firstEmptyInputController = getFirstEmptyInputController();
        Boolean valueOf = firstEmptyInputController != null ? Boolean.valueOf(((ptd) firstEmptyInputController).H0.requestFocus()) : null;
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }

    public final void L0() {
        l17 firstEmptyInputController = getFirstEmptyInputController();
        if (firstEmptyInputController != null) {
            mr0.V(((ptd) firstEmptyInputController).H0);
        }
    }

    public final int getCountCells() {
        bc7 bc7 = c2[1];
        return ((Number) this.Z1.b).intValue();
    }

    public final boolean getDisableInputsForError() {
        return this.V1;
    }

    public final fg3 getListener() {
        return this.W1;
    }

    public final m56 getOnAnimationEnded() {
        return this.a2;
    }

    public final gg3 getState() {
        bc7 bc7 = c2[0];
        return (gg3) this.X1.b;
    }

    public final void onDetachedFromWindow() {
        bud bud = this.b2;
        bud.b();
        bc7[] bc7Arr = bud.e;
        bc7 bc7 = bc7Arr[1];
        w4d w4d = bud.d;
        x77 x77 = (x77) w4d.T0(bud, bc7);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        w4d.o1(bud, bc7Arr[1], (Object) null);
        super.onDetachedFromWindow();
    }

    public final void onThemeChanged(fka fka) {
        int c = qp4.u0.j(this).c(getState().a);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            l17 H0 = H0(i);
            if (H0 != null) {
                eg3 eg3 = ((ptd) H0).H0;
                eg3 eg32 = eg3 instanceof kre ? eg3 : null;
                if (eg32 != null) {
                    eg32.onThemeChanged(fka);
                }
                eg3.setTextColor(c);
            }
        }
    }

    public final boolean requestFocus(int i, Rect rect) {
        return K0();
    }

    public final void setCountCells(int i) {
        this.Z1.o1(this, c2[1], Integer.valueOf(i));
    }

    public final void setDisableInputsForError(boolean z) {
        this.V1 = z;
    }

    public final void setKeyboardOpen(k56 k56) {
        this.Y1 = k56;
    }

    public final void setListener(fg3 fg3) {
        this.W1 = fg3;
    }

    public final void setOnAnimationEnded(m56 m56) {
        this.a2 = m56;
    }

    public final void setSecure(boolean z) {
        hdc adapter = getAdapter();
        qtd qtd = adapter instanceof qtd ? (qtd) adapter : null;
        if (qtd != null) {
            qtd.Z.o1(qtd, qtd.s0[0], Boolean.valueOf(z));
        }
    }

    public final void setState(gg3 gg3) {
        this.X1.o1(this, c2[0], gg3);
    }
}
