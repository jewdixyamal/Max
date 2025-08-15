package defpackage;

import androidx.appcompat.widget.Toolbar;
import java.util.WeakHashMap;

/* renamed from: r5  reason: default package */
public abstract class r5 extends q5 implements tsd {
    public static final /* synthetic */ int U0 = 0;

    public ai3 j0(int i) {
        setContentView(i);
        go9 go9 = new go9(new y7g((im) this), (Toolbar) findViewById(xxb.toolbar));
        go9.c = u();
        ai3 ai3 = new ai3(go9);
        Toolbar toolbar = (Toolbar) ai3.b;
        if (toolbar != null) {
            gte gte = new gte(1, (Object) ai3);
            WeakHashMap weakHashMap = zmf.a;
            omf.u(toolbar, gte);
        }
        return ai3;
    }
}
