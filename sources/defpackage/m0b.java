package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: m0b  reason: default package */
public final class m0b extends ConstraintLayout implements kre {
    public static final /* synthetic */ int N0 = 0;
    public final ImageView G0;
    public final TextView H0;
    public final TextView I0;
    public final jg3 J0;
    public final TextView K0;
    public final TextView L0;
    public k56 M0 = new s4a(23);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m0b(Context context) {
        super(context);
        Context context2 = context;
        cla cla = new cla(context2, 6);
        cla.setId(kxb.oneme_settings_privacy_pin_code_toolbar);
        cla.setBackgroundColor(0);
        cla.setForm(uka.a);
        cla.setLeftActions(new kka(new wz7(20, this)));
        cla.setLayoutParams(new ti3(-1, -2));
        addView(cla);
        ImageView imageView = new ImageView(context2);
        imageView.setId(kxb.oneme_settings_privacy_setup_pin_code_lock);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        pq9 pq9 = qp4.u0;
        shapeDrawable.setTint(pq9.j(imageView).b().l);
        imageView.setBackground(shapeDrawable);
        float f = (float) 16;
        rh4.p(f, fk4.d().getDisplayMetrics().density, imageView);
        imageView.setImageResource(gpc.s0);
        imageView.setImageTintList(ColorStateList.valueOf(pq9.j(imageView).getIcon().j));
        float f2 = (float) 64;
        imageView.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
        addView(imageView);
        this.G0 = imageView;
        TextView textView = new TextView(context2);
        textView.setId(kxb.oneme_settings_privacy_setup_pin_code_title);
        kqe kqe = i4f.j;
        kqe.b(textView, du4.b);
        textView.setTextColor(pq9.j(textView).getText().e);
        textView.setSingleLine(true);
        textView.setLayoutParams(new ti3(-2, -2));
        addView(textView);
        this.H0 = textView;
        TextView textView2 = new TextView(context2);
        textView2.setId(kxb.oneme_settings_privacy_setup_pin_code_description);
        textView2.setVisibility(8);
        i4f.m.b(textView2, du4.b);
        textView2.setTextColor(pq9.j(textView2).getText().g);
        ti3 ti3 = new ti3(-2, -2);
        textView2.setGravity(1);
        textView2.setLayoutParams(ti3);
        addView(textView2);
        this.I0 = textView2;
        jg3 jg3 = new jg3(context2, (AttributeSet) null);
        jg3.setId(kxb.oneme_settings_privacy_setup_pin_code_input);
        jg3.setKeyboardOpen(new s4a(24));
        jg3.setCountCells(4);
        jg3.setLayoutParams(new ti3(-2, -2));
        jg3.setSecure(true);
        jg3.setDisableInputsForError(false);
        pla.a(jg3, new bf3(jg3, jg3, 1));
        jg3.setKeyboardOpen(new lwa(2, jg3));
        addView(jg3);
        this.J0 = jg3;
        TextView textView3 = new TextView(context2);
        textView3.setId(kxb.oneme_settings_privacy_setup_pin_code_error);
        textView3.setVisibility(8);
        textView3.setTextAlignment(4);
        i4f.p.b(textView3, du4.b);
        textView3.setSingleLine(true);
        textView3.setLayoutParams(new ti3(-2, -2));
        addView(textView3);
        this.K0 = textView3;
        TextView textView4 = new TextView(context2);
        textView4.setId(kxb.oneme_settings_privacy_setup_pin_code_forgot);
        textView4.setVisibility(8);
        textView4.setText(p1c.oneme_settings_privacy_forgot_pin_code);
        textView4.isSingleLine();
        kqe.b(textView4, du4.b);
        textView4.setTextAlignment(4);
        textView4.setLayoutParams(new ti3(-2, -2));
        addView(textView4);
        this.L0 = textView4;
        onThemeChanged(pq9.j(this));
        dj3 q = fp3.q(this);
        int id = cla.getId();
        q.d(id, 3, 0, 3);
        q.d(id, 6, 0, 6);
        q.d(id, 7, 0, 7);
        int id2 = imageView.getId();
        q.d(id2, 3, cla.getId(), 4);
        float f3 = (float) 24;
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id2, 4));
        q.d(id2, 6, 0, 6);
        q.d(id2, 7, 0, 7);
        int id3 = textView.getId();
        q.d(id3, 3, imageView.getId(), 4);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id3, 4));
        q.d(id3, 6, 0, 6);
        float f4 = (float) 12;
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id3, 4));
        q.d(id3, 7, 0, 7);
        new l2a(q, 7, id3, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f4));
        int id4 = textView2.getId();
        q.d(id4, 3, textView.getId(), 4);
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id4, 4));
        q.d(id4, 6, 0, 6);
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id4, 4));
        q.d(id4, 7, 0, 7);
        new l2a(q, 7, id4, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f4));
        int id5 = jg3.getId();
        q.d(id5, 3, textView.getId(), 4);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id5, 4));
        q.d(id5, 6, 0, 6);
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id5, 4));
        q.d(id5, 7, 0, 7);
        new l2a(q, 7, id5, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f4));
        int id6 = textView3.getId();
        q.d(id6, 3, jg3.getId(), 4);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id6, 4));
        q.d(id6, 6, 0, 6);
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id6, 4));
        q.d(id6, 7, 0, 7);
        new l2a(q, 7, id6, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f4));
        int id7 = textView4.getId();
        q.d(id7, 6, 0, 6);
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id7, 4));
        q.d(id7, 7, 0, 7);
        au1.p(f4, fk4.d().getDisplayMetrics().density, new l2a(q, 7, id7, 4));
        q.d(id7, 4, 0, 4);
        new l2a(q, 4, id7, 4).e(tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        q.a(this);
    }

    public final k56 getOnBackPress() {
        return this.M0;
    }

    public final void onThemeChanged(fka fka) {
        setBackgroundColor(fka.b().k);
        ImageView imageView = this.G0;
        imageView.getBackground().setTint(fka.b().l);
        imageView.setImageTintList(ColorStateList.valueOf(fka.getIcon().j));
        this.H0.setTextColor(fka.getText().e);
        this.I0.setTextColor(fka.getText().g);
        this.J0.onThemeChanged(fka);
        this.K0.setTextColor(fka.getText().b);
        this.L0.setTextColor(fka.getText().j);
    }

    public final void setDescription(Integer num) {
        TextView textView = this.I0;
        if (num != null) {
            textView.setText(num.intValue());
            textView.setVisibility(0);
        } else {
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
        }
        int id = textView.getVisibility() == 0 ? textView.getId() : this.H0.getId();
        dj3 q = fp3.q(this);
        new sh0(this.J0.getId(), 4, (Object) q).E(id).e(tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density));
        q.a(this);
    }

    public final void setErrorText(CharSequence charSequence) {
        TextView textView = this.K0;
        textView.setText(charSequence);
        boolean z = !(charSequence == null || charSequence.length() == 0);
        float f = 0.0f;
        float f2 = z ? 1.0f : 0.0f;
        if (!z) {
            f = 1.0f;
        }
        textView.setAlpha(f);
        textView.animate().setDuration(200).alpha(f2).withEndAction(new u60((Object) this, z, 11)).start();
    }

    public final void setForgotPinCodeClickListener(k56 k56) {
        TextView textView = this.L0;
        if (k56 != null) {
            textView.setVisibility(0);
            tu0.K(textView, 300, new m6(18, k56));
            return;
        }
        textView.setVisibility(8);
        textView.setOnClickListener((View.OnClickListener) null);
    }

    public final void setListener(fg3 fg3) {
        this.J0.setListener(fg3);
    }

    public final void setLocked(boolean z) {
        this.G0.setImageResource(z ? gpc.Y : gpc.s0);
    }

    public final void setOnBackPress(k56 k56) {
        this.M0 = k56;
    }

    public final void setState(gg3 gg3) {
        this.J0.setState(gg3);
    }

    public final void setTitle(int i) {
        this.H0.setText(i);
    }
}
