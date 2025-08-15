package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;

/* renamed from: dk6  reason: default package */
public final class dk6 extends ColorDrawable {
    public final /* synthetic */ jec a;
    public final /* synthetic */ Path b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dk6(jec jec, Path path, int i) {
        super(i);
        this.a = jec;
        this.b = path;
    }

    public final void draw(Canvas canvas) {
        int save = canvas.save();
        if (this.a.a) {
            canvas.clipOutPath(this.b);
        }
        super.draw(canvas);
        canvas.restoreToCount(save);
    }
}
