package one.me.sdk.gallery.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.ScaleAnimation;
import androidx.appcompat.widget.AppCompatButton;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R*\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r8\u0006@BX\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0010¨\u0006\u001d"}, d2 = {"Lone/me/sdk/gallery/view/NumericCheckButton;", "Landroidx/appcompat/widget/AppCompatButton;", "", "id", "Le5f;", "setBackground", "(I)V", "number", "setNumber", "Landroid/graphics/drawable/Drawable;", "uncheckedBackground", "setUncheckedBackground", "(Landroid/graphics/drawable/Drawable;)V", "", "enabled", "setEnabled", "(Z)V", "Ltg;", "o", "Lje7;", "getAnimations", "()Ltg;", "animations", "checked", "s0", "Z", "isChecked", "()Z", "setChecked", "media-gallery-widget_release"}, k = 1, mv = {2, 0, 0})
public final class NumericCheckButton extends AppCompatButton {
    public static final int u0 = gpc.r;
    public static final int v0 = gpc.q;
    public static final int w0 = gpc.p;
    public final je7 o = jyc.a.getAccessor().d(tg.class);
    public boolean s0;
    public Drawable t0;

    public NumericCheckButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        je7 je7 = iyc.a;
        setBackground(u0);
    }

    private final tg getAnimations() {
        return (tg) this.o.getValue();
    }

    private final void setBackground(int i) {
        setBackground(kt3.b(getContext(), i));
    }

    private final void setChecked(boolean z) {
        ScaleAnimation scaleAnimation;
        if (z != this.s0) {
            this.s0 = z;
            clearAnimation();
            if (z) {
                scaleAnimation = new ScaleAnimation(0.9f, 1.0f, 0.9f, 1.0f, 50.0f, 50.0f);
                scaleAnimation.setInterpolator(getAnimations().a.f());
            } else {
                scaleAnimation = new ScaleAnimation(1.0f, 0.9f, 1.0f, 0.9f, 50.0f, 50.0f);
                scaleAnimation.setRepeatCount(1);
                scaleAnimation.setRepeatMode(2);
                scaleAnimation.setInterpolator(getAnimations().a.n());
            }
            scaleAnimation.setDuration(100);
            startAnimation(scaleAnimation);
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setBackground(isEnabled() ? u0 : v0);
    }

    public final void setNumber(int i) {
        if (i > 0) {
            setBackground(w0);
            String valueOf = i > 99999 ? "99999+" : String.valueOf(i);
            setTextSize(i < 1000 ? 12.0f : i > 99999 ? 7.0f : i > 9999 ? 8.0f : 10.0f);
            setText(valueOf);
            setChecked(true);
            return;
        }
        Drawable drawable = this.t0;
        if (drawable == null) {
            setBackground(u0);
        } else {
            setBackground(drawable);
        }
        setText((CharSequence) null);
        setChecked(false);
    }

    public final void setUncheckedBackground(Drawable drawable) {
        this.t0 = drawable;
    }
}
