package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: bh6  reason: default package */
public final class bh6 extends ConstraintLayout implements kre {
    public final yia G0;
    public final TextView H0;
    public final TextView I0;
    public final OneMeButton J0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bh6(Context context) {
        super(context);
        Context context2 = context;
        yia yia = new yia(context2);
        yia.setId(mea.c);
        this.G0 = yia;
        TextView textView = new TextView(context2);
        textView.setId(mea.e);
        textView.setText(context2.getString(oea.c));
        i4f.o.b(textView, du4.b);
        this.H0 = textView;
        TextView textView2 = new TextView(context2);
        textView2.setId(mea.d);
        i4f.s.b(textView2, du4.b);
        this.I0 = textView2;
        OneMeButton oneMeButton = new OneMeButton(context2, (AttributeSet) null);
        oneMeButton.setId(mea.b);
        oneMeButton.setSize(c7a.a);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setAppearance(z6a.c);
        oneMeButton.setText(oea.b);
        this.J0 = oneMeButton;
        setLayoutParams(new ti3(-1, -2));
        addView(yia, 0, -2);
        addView(oneMeButton, 0, -2);
        addView(textView, 0, -2);
        addView(textView2, 0, -2);
        onThemeChanged(qp4.u0.j(this));
        dj3 q = fp3.q(this);
        int id = yia.getId();
        q.d(id, 6, 0, 6);
        float f = (float) 12;
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id, 4));
        q.d(id, 3, 0, 3);
        q.d(id, 4, 0, 4);
        q.g(id).d.l0 = true;
        int id2 = textView.getId();
        q.d(id2, 6, yia.getId(), 7);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id2, 4));
        q.d(id2, 3, 0, 3);
        q.d(id2, 4, textView2.getId(), 4);
        q.d(id2, 7, oneMeButton.getId(), 6);
        float f2 = (float) 9;
        new l2a(q, 7, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        q.g(id2).d.l0 = true;
        q.g(id2).d.W = 2;
        int id3 = textView2.getId();
        q.d(id3, 6, yia.getId(), 7);
        new l2a(q, 6, id3, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        q.d(id3, 3, textView.getId(), 3);
        q.d(id3, 4, 0, 4);
        q.d(id3, 7, oneMeButton.getId(), 6);
        new l2a(q, 7, id3, 4).e(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        q.g(id3).d.l0 = true;
        int id4 = oneMeButton.getId();
        q.d(id4, 7, 0, 7);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(q, 7, id4, 4));
        q.d(id4, 3, 0, 3);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id4, 4));
        q.d(id4, 4, 0, 4);
        new l2a(q, 4, id4, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        q.g(id4).d.l0 = true;
        q.a(this);
    }

    public final void onThemeChanged(fka fka) {
        this.H0.setTextColor(fka.getText().e);
        this.I0.setTextColor(fka.getText().g);
        this.J0.onThemeChanged(fka);
    }

    public final void setJoinAction(k56 k56) {
        OneMeButton oneMeButton = this.J0;
        if (k56 == null) {
            oneMeButton.setOnClickListener((View.OnClickListener) null);
        } else {
            tu0.K(oneMeButton, 300, new m6(11, k56));
        }
    }
}
