package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: lf2  reason: default package */
public final class lf2 extends ConstraintLayout implements kre {
    public final TextView G0;
    public final TextView H0;
    public final TextView I0;
    public final s5a J0;
    public final LinearLayout K0;

    public lf2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView = new TextView(context);
        ti3 ti3 = new ti3(-1, -2);
        float f = (float) 4;
        ti3.bottomMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        textView.setLayoutParams(ti3);
        i4f.j.b(textView, du4.b);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.G0 = textView;
        TextView textView2 = new TextView(context);
        ti3 ti32 = new ti3(-1, -2);
        ti32.bottomMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
        textView2.setLayoutParams(ti32);
        kqe kqe = i4f.n;
        kqe.b(textView2, du4.b);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        textView2.setVisibility(8);
        this.H0 = textView2;
        TextView textView3 = new TextView(context);
        textView3.setLayoutParams(new ti3(-1, -2));
        kqe.b(textView3, du4.b);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        pq9 pq9 = qp4.u0;
        int i = pq9.j(textView3).d().a.a.h;
        textView3.setBackground(new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, new ColorDrawable(-1)));
        this.I0 = textView3;
        s5a s5a = new s5a(context);
        s5a.setId(wea.j0);
        float f2 = (float) 48;
        s5a.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
        s5a.setAvatarShape(l5a.a);
        this.J0 = s5a;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(wea.i0);
        linearLayout.setLayoutParams(new ti3(0, -2));
        linearLayout.setOrientation(1);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(textView3);
        this.K0 = linearLayout;
        setLayoutParams(new ti3(-1, -2));
        int G = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
        setPadding(G, G, G, G);
        int i2 = pq9.j(this).d().a.a.h;
        setBackground(new RippleDrawable(ColorStateList.valueOf(i2), (Drawable) null, new ColorDrawable(-1)));
        addView(s5a);
        addView(linearLayout);
        onThemeChanged(pq9.j(this));
    }

    public final void onThemeChanged(fka fka) {
        this.G0.setTextColor(fka.getText().e);
        this.H0.setTextColor(fka.getText().g);
        this.I0.setTextColor(fka.getText().j);
        this.J0.onThemeChanged(fka);
    }

    public final void setLink(CharSequence charSequence) {
        this.I0.setText(charSequence);
    }

    public final void setLinkOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.I0.setOnLongClickListener(onLongClickListener);
    }

    public final void setLinkPhoto(String str) {
        uc0 a = oag.a(this.G0.getText(), 9223372036854775806L);
        s5a s5a = this.J0;
        s5a.setAvatarUrl(str);
        s5a.g(a, false);
        dj3 q = fp3.q(this);
        int id = s5a.getId();
        q.d(id, 6, 0, 6);
        q.d(id, 3, 0, 3);
        q.d(id, 4, 0, 4);
        int id2 = this.K0.getId();
        q.d(id2, 3, 0, 3);
        q.d(id2, 4, 0, 4);
        q.d(id2, 7, 0, 7);
        q.d(id2, 6, s5a.getId(), 7);
        new l2a(q, 6, id2, 4).e(tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density));
        q.a(this);
    }

    public final void setOnLinkClickListener(View.OnClickListener onClickListener) {
        tu0.K(this.I0, 300, onClickListener);
    }

    public final void setSubtitle(CharSequence charSequence) {
        TextView textView = this.H0;
        int i = 0;
        if (!(true ^ (charSequence == null || charSequence.length() == 0))) {
            i = 8;
        }
        textView.setVisibility(i);
        textView.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.G0.setText(charSequence);
    }
}
