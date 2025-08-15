package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;

/* renamed from: vf7  reason: default package */
public final class vf7 extends LinearLayout {
    public boolean a = true;
    public final ld6 b;
    public final ImageView c;

    public vf7(Context context) {
        super(context, (AttributeSet) null);
        ld6 ld6 = new ld6(context);
        ld6.setAnimConfig(new kd6(0, 0, 1500, 0.0f, 16));
        this.b = ld6;
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        setOrientation(0);
        ld6.setImageResource(eub.max_image_logo);
        float f = (float) 32;
        ld6.setLayoutParams(new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f)));
        imageView.setImageResource(eub.max_text_logo);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(((float) 58) * fk4.d().getDisplayMetrics().density), tu0.G(f * fk4.d().getDisplayMetrics().density));
        layoutParams.setMarginStart(tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density));
        imageView.setLayoutParams(layoutParams);
        addView(ld6);
        addView(imageView);
        setGravity(17);
        post(new nn6(6, this));
        v3c.y(new xh0(3, (Continuation) null, 17), this);
    }
}
