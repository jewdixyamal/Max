package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: q21  reason: default package */
public final class q21 extends ConstraintLayout {
    public final no1 G0;
    public p21 H0;

    public q21(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutParams(new ti3(-1, -1));
        setBackgroundColor(qp4.u0.p(this).c.b().k);
        setFocusable(true);
        setClickable(true);
        no1 no1 = new no1(context, (AttributeSet) null);
        no1.setId(rvb.call_user_full_avatar);
        no1.setMode(jo1.b);
        this.G0 = no1;
        new ViewStub(context).setId(rvb.call_recall);
        new ViewStub(context).setId(rvb.call_cancel);
        addView(no1, -1, 0);
        dj3 q = fp3.q(this);
        int id = no1.getId();
        q.d(id, 7, 0, 7);
        q.d(id, 6, 0, 6);
        q.d(id, 3, 0, 3);
        q.d(id, 4, 0, 4);
        q.a(this);
    }

    public final void setClickListener(p21 p21) {
        this.H0 = p21;
    }

    public final void setName(CharSequence charSequence) {
        this.G0.setName(charSequence);
    }

    public final void setStatus(CharSequence charSequence) {
        this.G0.setStatus(charSequence);
    }
}
