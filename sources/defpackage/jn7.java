package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.ImageView;
import ru.ok.messages.views.widgets.EllipsizingEndTextView;
import ru.ok.messages.views.widgets.ImageSpanEllipsizedTextView;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: jn7  reason: default package */
public final class jn7 extends dec implements nse {
    public final ImageView F0;
    public final ImageSpanEllipsizedTextView G0;
    public final EllipsizingEndTextView H0;

    public jn7(kn7 kn7, View view) {
        super(view);
        TamAvatarView tamAvatarView = (TamAvatarView) view.findViewById(xxb.row_chat_location__vw_avatar);
        ImageView imageView = (ImageView) view.findViewById(xxb.row_chat_location__stop);
        this.F0 = imageView;
        ImageSpanEllipsizedTextView imageSpanEllipsizedTextView = (ImageSpanEllipsizedTextView) view.findViewById(xxb.row_chat_location__tv_title);
        this.G0 = imageSpanEllipsizedTextView;
        new vqe(imageSpanEllipsizedTextView, c54.a(imageSpanEllipsizedTextView.getContext())).a();
        this.H0 = (EllipsizingEndTextView) view.findViewById(xxb.row_chat_location__tv_subtitle);
        nd7.h(view, new e5(10, this));
        nd7.h(imageView, new e5(10, this));
        c();
    }

    public final void c() {
        View view = this.a;
        Context context = view.getContext();
        khe khe = sme.a0;
        sme R = fm9.R(context);
        view.setBackground(hm9.L(0, R.i));
        RippleDrawable a = R.a();
        ImageView imageView = this.F0;
        imageView.setBackground(a);
        imageView.setColorFilter(R.M, PorterDuff.Mode.SRC_IN);
        this.G0.setTextColor(R.F);
        this.H0.setTextColor(R.J);
    }
}
