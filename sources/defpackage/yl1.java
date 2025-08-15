package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: yl1  reason: default package */
public final class yl1 extends ConstraintLayout {
    public xl1 G0;
    public boolean H0;
    public final ufd I0;
    public final AppCompatTextView J0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yl1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        pq9 pq9 = qp4.u0;
        setBackgroundColor(pq9.p(this).c.b().k);
        dy7.H(this, fk4.d().getDisplayMetrics().density * 16.0f);
        br7.d(this, new x27(0, new yq0(5, 2, false), 1), (m56) null);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context2, (AttributeSet) null);
        appCompatImageView.setId(y7a.M);
        float f = (float) 48;
        appCompatImageView.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        appCompatImageView.setImageResource(x7a.s0);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9.p(appCompatImageView).c.getIcon().f));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, (AttributeSet) null);
        appCompatTextView.setId(y7a.B1);
        appCompatTextView.setLayoutParams(new ti3(-1, -2));
        appCompatTextView.setGravity(17);
        i4f.c.b(appCompatTextView, du4.b);
        appCompatTextView.setTextColor(pq9.p(appCompatTextView).c.getText().e);
        this.J0 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context2, (AttributeSet) null);
        appCompatTextView2.setId(y7a.A1);
        appCompatTextView2.setLayoutParams(new ti3(-1, -2));
        appCompatTextView2.setGravity(17);
        i4f.p.b(appCompatTextView2, du4.b);
        appCompatTextView2.setTextColor(pq9.p(appCompatTextView2).c.getText().g);
        appCompatTextView2.setText(b8a.Y);
        OneMeButton oneMeButton = new OneMeButton(context2, (AttributeSet) null);
        oneMeButton.setId(y7a.z1);
        oneMeButton.setLayoutParams(new ti3(-2, -2));
        oneMeButton.setMode(b7a.a);
        oneMeButton.setSize(c7a.b);
        oneMeButton.setCustomTheme(pq9.p(oneMeButton).c);
        oneMeButton.setAppearance(z6a.X);
        oneMeButton.setText(b8a.X);
        tu0.K(oneMeButton, 300, new wl1(this, 0));
        ufd ufd = new ufd(context2, (AttributeSet) null);
        ufd.setId(y7a.C1);
        ufd.setStartIcon(x7a.t0);
        ufd.setTitle((jqe) new eqe(b8a.Q));
        ufd.setType(jfd.b);
        ufd.setEndView(new ffd(this.H0, true));
        ufd.setOnSwitchCheckedListener(new bk(3, this));
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = fk4.d().getDisplayMetrics().density * 16.0f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(pq9.p(ufd).c.b().a.g);
        ufd.setBackground(shapeDrawable);
        ufd.setThemeDepended(pfd.b);
        tu0.K(ufd, 300, new wl1(this, 1));
        this.I0 = ufd;
        addView(appCompatImageView);
        addView(this.J0);
        addView(appCompatTextView2);
        addView(oneMeButton);
        addView(ufd);
        dj3 q = fp3.q(this);
        int id = appCompatImageView.getId();
        q.d(id, 3, 0, 3);
        float f2 = (float) 16;
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id, 4));
        q.d(id, 7, 0, 7);
        q.d(id, 6, 0, 6);
        q.d(id, 4, this.J0.getId(), 3);
        q.g(id).d.W = 2;
        int id2 = this.J0.getId();
        q.d(id2, 3, appCompatImageView.getId(), 4);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id2, 4));
        q.d(id2, 7, 0, 7);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 7, id2, 4));
        q.d(id2, 6, 0, 6);
        new l2a(q, 6, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        q.d(id2, 4, appCompatTextView2.getId(), 3);
        int id3 = appCompatTextView2.getId();
        q.d(id3, 3, this.J0.getId(), 4);
        au1.p((float) 8, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id3, 4));
        q.d(id3, 6, 0, 6);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id3, 4));
        q.d(id3, 7, 0, 7);
        new l2a(q, 7, id3, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        q.d(id3, 4, oneMeButton.getId(), 3);
        new l2a(q, 4, id3, 4).e(tu0.G(((float) 5) * fk4.d().getDisplayMetrics().density));
        int id4 = oneMeButton.getId();
        q.d(id4, 3, appCompatTextView2.getId(), 4);
        au1.p((float) 24, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id4, 4));
        q.d(id4, 6, 0, 6);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id4, 4));
        q.d(id4, 7, 0, 7);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 7, id4, 4));
        q.d(id4, 4, 0, 4);
        new l2a(q, 4, id4, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        int id5 = ufd.getId();
        q.d(id5, 6, 0, 6);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id5, 4));
        q.d(id5, 7, 0, 7);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 7, id5, 4));
        q.d(id5, 4, 0, 4);
        new l2a(q, 4, id5, 4).e(tu0.G(((float) 112) * fk4.d().getDisplayMetrics().density));
        q.a(this);
    }

    public final void setListener(xl1 xl1) {
        this.G0 = xl1;
    }

    public final void setTitle(jqe jqe) {
        this.J0.setText(jqe.b(getContext()));
    }
}
