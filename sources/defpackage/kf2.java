package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: kf2  reason: default package */
public final class kf2 extends ConstraintLayout implements kre {
    public final TextView G0;
    public final TextView H0;
    public final Drawable I0;
    public final FrameLayout J0;
    public final je7 K0;
    public final s5a L0;
    public final ImageView M0;

    public kf2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView = new TextView(context);
        ti3 ti3 = new ti3(-1, -2);
        ti3.bottomMargin = tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
        textView.setLayoutParams(ti3);
        i4f.j.b(textView, du4.b);
        textView.setSingleLine(true);
        textView.setMaxLines(1);
        textView.setLetterSpacing(0.0f);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        this.G0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setLayoutParams(new ti3(-1, -2));
        i4f.n.b(textView2, du4.b);
        textView2.setMaxLines(1);
        this.H0 = textView2;
        int G = tu0.G(((float) 48) * fk4.d().getDisplayMetrics().density);
        Drawable b = kt3.b(getContext(), woc.L);
        this.I0 = b;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(wea.g0);
        ti3 ti32 = new ti3(G, G);
        float f = (float) 12;
        ti32.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        frameLayout.setLayoutParams(ti32);
        this.J0 = frameLayout;
        this.K0 = tu0.r(3, new x2((Object) context, 20, (Object) this));
        s5a s5a = new s5a(context);
        s5a.setId(wea.h0);
        s5a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        s5a.setAvatarShape(l5a.a);
        s5a.j(s5a, b, (m5a) null, 30);
        frameLayout.addView(s5a);
        this.L0 = s5a;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(wea.e0);
        linearLayout.setLayoutParams(new ti3(0, -2));
        linearLayout.setOrientation(1);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        ImageView imageView = new ImageView(context);
        imageView.setId(wea.f0);
        float f2 = (float) 24;
        imageView.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
        imageView.setVisibility(4);
        this.M0 = imageView;
        setLayoutParams(new ti3(-1, -2));
        pq9 pq9 = qp4.u0;
        int i = pq9.j(this).d().a.a.h;
        setBackground(new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, new ColorDrawable(-1)));
        setMinimumHeight(tu0.G(((float) 72) * fk4.d().getDisplayMetrics().density));
        float f3 = (float) 15;
        setPaddingRelative(0, tu0.G(fk4.d().getDisplayMetrics().density * f3), 0, tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        addView(frameLayout);
        addView(linearLayout);
        addView(imageView);
        dj3 q = fp3.q(this);
        int id = frameLayout.getId();
        q.d(id, 6, 0, 6);
        q.d(id, 3, 0, 3);
        q.d(id, 4, 0, 4);
        int id2 = linearLayout.getId();
        q.d(id2, 3, 0, 3);
        q.d(id2, 4, 0, 4);
        q.d(id2, 6, frameLayout.getId(), 7);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id2, 4));
        q.d(id2, 7, 0, 7);
        new l2a(q, 7, id2, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        q.a(this);
        onThemeChanged(pq9.j(this));
    }

    public final void onThemeChanged(fka fka) {
        this.G0.setTextColor(fka.getText().e);
        this.H0.setTextColor(fka.getText().g);
        this.L0.onThemeChanged(fka);
        this.M0.setImageTintList(ColorStateList.valueOf(fka.getIcon().f));
    }

    public final void setFileDescription(CharSequence charSequence) {
        this.H0.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.G0.setText(charSequence);
    }
}
