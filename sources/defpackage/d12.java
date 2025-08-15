package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: d12  reason: default package */
public final class d12 extends ViewGroup implements kre {
    public final s5a a;
    public final TextView b;
    public final ImageView c;

    public d12(Context context) {
        super(context);
        s5a s5a = new s5a(context);
        this.a = s5a;
        TextView textView = new TextView(context);
        i4f.l.b(textView, du4.b);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.b = textView;
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        addView(s5a);
        addView(textView);
        addView(imageView);
        s5a.setAvatarShape(j5a.a);
        float f = (float) 12;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), getPaddingBottom());
        onThemeChanged(qp4.u0.j(this));
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int measuredHeight = getMeasuredHeight();
        s5a s5a = this.a;
        ote.E(s5a, paddingLeft, (measuredHeight - s5a.getMeasuredHeight()) / 2, 0, 12);
        TextView textView = this.b;
        ote.E(textView, rh4.c((float) 12, fk4.d().getDisplayMetrics().density, s5a.getRight()), (getMeasuredHeight() - textView.getMeasuredHeight()) / 2, 0, 12);
        ImageView imageView = this.c;
        ote.E(imageView, (getMeasuredWidth() - getPaddingRight()) - imageView.getMeasuredWidth(), (getMeasuredHeight() - imageView.getMeasuredHeight()) / 2, 0, 12);
    }

    public final void onMeasure(int i, int i2) {
        TextView textView = this.b;
        if (qqe.c(textView)) {
            setVerified(true);
        }
        float f = (float) 40;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(tu0.G(fk4.d().getDisplayMetrics().density * f), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(tu0.G(f * fk4.d().getDisplayMetrics().density), 1073741824);
        s5a s5a = this.a;
        s5a.measure(makeMeasureSpec, makeMeasureSpec2);
        int mode = View.MeasureSpec.getMode(i);
        int size = (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.getSize(i) : Integer.MAX_VALUE;
        ImageView imageView = this.c;
        float f2 = (float) 20;
        imageView.measure(View.MeasureSpec.makeMeasureSpec(tu0.G(fk4.d().getDisplayMetrics().density * f2), 1073741824), View.MeasureSpec.makeMeasureSpec(tu0.G(f2 * fk4.d().getDisplayMetrics().density), 1073741824));
        int paddingLeft = (size - getPaddingLeft()) - s5a.getMeasuredWidth();
        float f3 = (float) 12;
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec((rh4.q(f3, fk4.d().getDisplayMetrics().density, rh4.q(f3, fk4.d().getDisplayMetrics().density, paddingLeft)) - imageView.getMeasuredWidth()) - getPaddingRight(), Integer.MIN_VALUE);
        float f4 = (float) 56;
        textView.measure(makeMeasureSpec3, View.MeasureSpec.makeMeasureSpec(tu0.G(fk4.d().getDisplayMetrics().density * f4), Integer.MIN_VALUE));
        setMeasuredDimension(size, tu0.G(f4 * fk4.d().getDisplayMetrics().density));
    }

    public final void onThemeChanged(fka fka) {
        this.b.setTextColor(fka.getText().e);
        this.c.setImageTintList(ColorStateList.valueOf(fka.getIcon().i));
    }

    public final void setOnTrailClick(View.OnClickListener onClickListener) {
        tu0.K(this.c, 300, new tb((Object) onClickListener, 7, (Object) this));
    }

    public final void setTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void setTrail(int i) {
        this.c.setImageResource(i);
    }

    public final void setVerified(boolean z) {
        ecf ecf;
        TextView textView = this.b;
        int I = i24.I(qqe.e(textView));
        int i = 0;
        if (z) {
            ecf a2 = qqe.a(textView);
            if ((a2 != null ? a2.a : 0) == I) {
                return;
            }
        }
        if (z) {
            ecf a3 = qqe.a(textView);
            if (a3 != null) {
                i = a3.a;
            }
            if (i != I) {
                ecf = new ecf(getContext(), I, new we1(5));
                qqe.d(textView, ecf);
            }
        }
        ecf = null;
        qqe.d(textView, ecf);
    }
}
