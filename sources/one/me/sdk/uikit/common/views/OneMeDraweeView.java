package one.me.sdk.uikit.common.views;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lone/me/sdk/uikit/common/views/OneMeDraweeView;", "Lcom/facebook/drawee/view/SimpleDraweeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "withAutoPlay", "Le5f;", "setupNewController", "(Z)V", "common_release"}, k = 1, mv = {2, 0, 0})
public class OneMeDraweeView extends SimpleDraweeView {
    public static final /* synthetic */ int B0 = 0;
    public boolean A0;
    public final String x0 = getClass().getName();
    public final wjc y0 = new wjc();
    public final n5 z0 = new n5(3, this);

    public OneMeDraweeView(Context context) {
        super(context);
        setupNewController(false);
    }

    public final void invalidateDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.invalidateDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new i76((Object) this, 13, (Object) drawable));
        } else {
            post(new h76(this, 16, drawable));
        }
    }

    public final void o(wv6 wv6, wv6 wv62) {
        ide ide;
        wjc wjc = this.y0;
        if (wv6 != null) {
            if (wv62 != null) {
                iv6 o = s36.o();
                o.getClass();
                hv6 hv6 = new hv6(o, wv6, (Object) null);
                iv6 o2 = s36.o();
                o2.getClass();
                ide = new rz6(y53.M(hv6, new hv6(o2, wv62, (Object) null)), false);
            } else {
                iv6 o3 = s36.o();
                o3.getClass();
                ide = new hv6(o3, wv6, (Object) null);
            }
            wjc.a(ide);
            if (getController() == null) {
                setupNewController(this.A0);
            }
        } else if (wv62 != null) {
            iv6 o4 = s36.o();
            o4.getClass();
            wjc.a(new hv6(o4, wv62, (Object) null));
            if (getController() == null) {
                setupNewController(this.A0);
            }
        } else {
            setController((mq4) null);
        }
    }

    public void p(ru6 ru6, Animatable animatable) {
    }

    public final void setupNewController(boolean z) {
        this.A0 = z;
        e2b a = s36.a.get();
        a.g = this.y0;
        a.h = this.z0;
        a.l = getController();
        a.j = z;
        setController(a.a());
    }

    public OneMeDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setupNewController(false);
    }
}
