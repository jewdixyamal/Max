package one.me.appupdate.forceupdate;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/appupdate/forceupdate/ForceUpdateScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "app-update_release"}, k = 1, mv = {2, 0, 0})
public final class ForceUpdateScreen extends Widget {
    public static final /* synthetic */ int o = 0;
    public final x27 a = new x27(0, new yq0(3, 1, false), 1);
    public final up b;
    public final c6a c;

    public ForceUpdateScreen() {
        super((Bundle) null, 0, 3, (z84) null);
        pp ppVar = pp.a;
        this.b = (up) ppVar.getAccessor().c(up.class);
        this.c = (c6a) ppVar.getAccessor().c(c6a.class);
    }

    public final x27 getInsetsConfig() {
        return this.a;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ImageView imageView = new ImageView(getContext());
        imageView.setId(l4a.a);
        imageView.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 32.0f));
        imageView.setBackground(s36.n((Context) this.c.a.c(Context.class), bzb.ic_launcher_background));
        rh4.p((float) 17, fk4.d().getDisplayMetrics().density, imageView);
        imageView.setImageResource(woc.d);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setId(l4a.e);
        imageView2.setClipToOutline(true);
        imageView2.setOutlineProvider(new e62(imageView2, 4));
        imageView2.setBackground(s36.a(imageView2.getContext(), 1301046487, 78.0f, true));
        float f = (float) 12;
        rh4.p(f, fk4.d().getDisplayMetrics().density, imageView2);
        imageView2.setImageResource(woc.g);
        TextView textView = new TextView(getContext());
        textView.setId(l4a.c);
        textView.setGravity(1);
        i4f.h.b(textView, du4.b);
        pq9 pq9 = qp4.u0;
        textView.setTextColor(pq9.j(textView).getText().e);
        textView.setText(m4a.b);
        TextView textView2 = new TextView(getContext());
        textView2.setId(l4a.b);
        textView2.setGravity(1);
        i4f.H.b(textView2, du4.b);
        textView2.setTextColor(pq9.j(textView2).getText().e);
        textView2.setText(m4a.a);
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setId(l4a.d);
        oneMeButton.setAppearance(z6a.c);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setText(m4a.c);
        tu0.K(oneMeButton, 300, new xx5(0, this));
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        v3c.y(new yx5(textView, textView2, (Continuation) null, 0), constraintLayout);
        float f2 = (float) 120;
        constraintLayout.addView(imageView, tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        float f3 = (float) 60;
        ti3 ti3 = new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        float f4 = (float) 84;
        ti3.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f4));
        ti3.topMargin = tu0.G(f4 * fk4.d().getDisplayMetrics().density);
        constraintLayout.addView(imageView2, ti3);
        ti3 ti32 = new ti3(-1, -2);
        ti32.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        ti32.setMarginEnd(tu0.G(fk4.d().getDisplayMetrics().density * f));
        ti32.bottomMargin = tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density);
        ti32.topMargin = tu0.G(((float) 50) * fk4.d().getDisplayMetrics().density);
        constraintLayout.addView(textView, ti32);
        ti3 ti33 = new ti3(-1, -2);
        ti33.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        ti33.setMarginEnd(tu0.G(fk4.d().getDisplayMetrics().density * f));
        constraintLayout.addView(textView2, ti33);
        ti3 ti34 = new ti3(-1, -2);
        ti34.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        ti34.setMarginEnd(tu0.G(f * fk4.d().getDisplayMetrics().density));
        ti34.bottomMargin = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
        constraintLayout.addView(oneMeButton, ti34);
        dj3 q = fp3.q(constraintLayout);
        int id = imageView.getId();
        q.d(id, 3, 0, 3);
        q.d(id, 6, 0, 6);
        q.d(id, 7, 0, 7);
        q.d(id, 4, textView.getId(), 3);
        q.g(id).d.W = 2;
        int id2 = imageView2.getId();
        q.d(id2, 3, imageView.getId(), 3);
        q.d(id2, 4, imageView.getId(), 4);
        q.d(id2, 6, imageView.getId(), 6);
        q.d(id2, 7, imageView.getId(), 7);
        int id3 = textView.getId();
        q.d(id3, 3, imageView.getId(), 4);
        q.d(id3, 6, 0, 6);
        q.d(id3, 7, 0, 7);
        q.d(id3, 4, textView2.getId(), 3);
        int id4 = textView2.getId();
        q.d(id4, 3, textView.getId(), 4);
        q.d(id4, 6, 0, 6);
        q.d(id4, 7, 0, 7);
        q.d(id4, 4, oneMeButton.getId(), 3);
        int id5 = oneMeButton.getId();
        q.d(id5, 4, 0, 4);
        q.d(id5, 6, 0, 6);
        q.d(id5, 7, 0, 7);
        q.a(constraintLayout);
        return constraintLayout;
    }
}
