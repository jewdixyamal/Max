package one.me.sdk.uikit.common.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lone/me/sdk/uikit/common/button/OneMeTitleSubtitleButton;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lkre;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "title", "Le5f;", "setTitle", "(Ljava/lang/CharSequence;)V", "subtitle", "setSubtitle", "common_release"}, k = 1, mv = {2, 0, 0})
public final class OneMeTitleSubtitleButton extends AppCompatTextView implements kre {
    public final ShapeDrawable A0;
    public final RippleDrawable B0;
    public SpannableString u0;
    public SpannableString v0;
    public final TextAppearanceSpan w0;
    public final TextAppearanceSpan x0;
    public final b7a y0 = b7a.a;
    public final z6a z0 = z6a.a;

    public OneMeTitleSubtitleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w0 = new TextAppearanceSpan(context, aga.b);
        this.x0 = new TextAppearanceSpan(context, aga.a);
        c7a c7a = c7a.c;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.A0 = shapeDrawable;
        pq9 pq9 = qp4.u0;
        int i = pq9.j(this).d().a.a.d;
        this.B0 = new RippleDrawable(ColorStateList.valueOf(i), shapeDrawable, new ColorDrawable(-65536));
        setGravity(17);
        setMinimumHeight(lz7.r(c7a));
        setOutlineProvider(new ix3(lz7.d(c7a)));
        float f = (float) 20;
        float f2 = (float) 4;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        onThemeChanged(pq9.j(this));
    }

    public final void j(CharSequence charSequence, CharSequence charSequence2) {
        SpannableString valueOf;
        SpannableString spannableString;
        SpannableString spannableString2 = null;
        if (charSequence != this.u0) {
            if (charSequence == null || (spannableString = SpannableString.valueOf(charSequence)) == null) {
                spannableString = null;
            } else {
                spannableString.setSpan(this.w0, 0, charSequence.length(), 17);
            }
            this.u0 = spannableString;
        }
        if (charSequence2 != this.v0) {
            if (!(charSequence2 == null || (valueOf = SpannableString.valueOf(charSequence2)) == null)) {
                valueOf.setSpan(this.x0, 0, charSequence2.length(), 17);
                spannableString2 = valueOf;
            }
            this.v0 = spannableString2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequence3 = this.u0;
        if (charSequence3 == null) {
            charSequence3 = "";
        }
        SpannableStringBuilder append = spannableStringBuilder.append(charSequence3);
        SpannableString spannableString3 = this.v0;
        if (spannableString3 != null) {
            append.append(10);
            append.append(spannableString3);
        }
        setText(append);
    }

    public final void onThemeChanged(fka fka) {
        pq9 pq9 = qp4.u0;
        fka j = pq9.j(this);
        boolean isEnabled = isEnabled();
        b7a b7a = this.y0;
        z6a z6a = this.z0;
        setTextColor(lz7.S(j, b7a, z6a, isEnabled));
        hv0 c = lz7.c(pq9.j(this), b7a, z6a, isEnabled());
        Paint paint = this.A0.getPaint();
        Integer num = c.a;
        paint.setColor(num != null ? num.intValue() : 0);
        ColorStateList valueOf = ColorStateList.valueOf(c.b);
        RippleDrawable rippleDrawable = this.B0;
        rippleDrawable.setColor(valueOf);
        setBackground(rippleDrawable);
        invalidate();
    }

    public final void setSubtitle(CharSequence charSequence) {
        j(this.u0, charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        j(charSequence, this.v0);
    }
}
