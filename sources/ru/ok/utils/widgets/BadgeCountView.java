package ru.ok.utils.widgets;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001bJ\u0019\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR+\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00038F@FX\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0007R/\u0010!\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001b8B@BX\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ok/utils/widgets/BadgeCountView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lnse;", "", "backgroundColor", "Le5f;", "setBackgroundColor", "(I)V", "", "u0", "Z", "getNeedPlusIndicator", "()Z", "setNeedPlusIndicator", "(Z)V", "needPlusIndicator", "v0", "getManageVisibility", "setManageVisibility", "manageVisibility", "<set-?>", "w0", "Ls7c;", "getCount", "()I", "setCount", "count", "Lag0;", "x0", "getStyle", "()Lag0;", "setStyle", "(Lag0;)V", "style", "ui-utils_release"}, k = 1, mv = {2, 0, 0})
public final class BadgeCountView extends AppCompatTextView implements nse {
    public static final /* synthetic */ bc7[] z0;
    public boolean u0;
    public boolean v0 = true;
    public final sc0 w0;
    public final yj x0;
    public int y0;

    static {
        Class<BadgeCountView> cls = BadgeCountView.class;
        z0 = new bc7[]{new oi9(cls, NewHtcHomeBadger.COUNT, "getCount()I"), rh4.g(nec.a, cls, "style", "getStyle()Lru/ok/utils/widgets/BadgeCountView$Style;")};
    }

    public BadgeCountView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setGravity(17);
        setIncludeFontPadding(false);
        setTextAlignment(4);
        setVisibility(8);
        c();
        this.w0 = new sc0(this, context);
        this.x0 = new yj(1, this);
        this.y0 = -1;
    }

    private final ag0 getStyle() {
        bc7 bc7 = z0[1];
        return (ag0) this.x0.b;
    }

    /* access modifiers changed from: private */
    public final void setStyle(ag0 ag0) {
        this.x0.o1(this, z0[1], ag0);
    }

    public final void c() {
        sme sme;
        if (isInEditMode()) {
            setTextColor(-1);
            setBackgroundColor(-16776961);
            setCount(20);
            this.u0 = true;
            return;
        }
        if (isInEditMode()) {
            sme = ee4.e0;
        } else {
            Context context = getContext();
            khe khe = sme.a0;
            sme = fm9.R(context);
        }
        setTextColor(sme.F);
        setBackgroundColor(sme.H);
    }

    public final int getCount() {
        bc7 bc7 = z0[0];
        return ((Number) this.w0.b).intValue();
    }

    public final boolean getManageVisibility() {
        return this.v0;
    }

    public final boolean getNeedPlusIndicator() {
        return this.u0;
    }

    public void setBackgroundColor(int i) {
        this.y0 = i;
        Drawable background = getBackground();
        if (background instanceof ShapeDrawable) {
            ((ShapeDrawable) background).getPaint().setColor(i);
        } else if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background).setColor(i);
        }
    }

    public final void setCount(int i) {
        this.w0.o1(this, z0[0], Integer.valueOf(i));
    }

    public final void setManageVisibility(boolean z) {
        this.v0 = z;
    }

    public final void setNeedPlusIndicator(boolean z) {
        this.u0 = z;
    }
}
