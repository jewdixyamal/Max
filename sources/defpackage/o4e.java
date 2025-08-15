package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* renamed from: o4e  reason: default package */
public final class o4e extends LinearLayout {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public o4e(Context context) {
        super(context, (AttributeSet) null);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setOrientation(1);
        setGravity(17);
        int G = tu0.G(((float) 21) * fk4.d().getDisplayMetrics().density);
        ImageView imageView = new ImageView(context);
        int G2 = tu0.G(((float) 188) * fk4.d().getDisplayMetrics().density);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(G2, G2));
        addView(imageView);
        this.a = imageView;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
        layoutParams.leftMargin = G;
        layoutParams.rightMargin = G;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        i4f.d.b(textView, du4.b);
        v3c.y(new fv5(3, (Continuation) null, 1), textView);
        addView(textView);
        this.b = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density);
        layoutParams2.leftMargin = G;
        layoutParams2.rightMargin = G;
        textView2.setLayoutParams(layoutParams2);
        textView2.setGravity(17);
        i4f.n.b(textView2, du4.b);
        v3c.y(new fv5(3, (Continuation) null, 2), textView2);
        addView(textView2);
        this.c = textView2;
    }

    public final void setIcon(int i) {
        this.a.setImageResource(i);
    }

    public final void setSubtitle(Integer num) {
        TextView textView = this.c;
        if (num == null) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(num.intValue());
    }

    public final void setTitle(int i) {
        this.b.setText(i);
    }
}
