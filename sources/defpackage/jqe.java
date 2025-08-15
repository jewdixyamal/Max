package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.View;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: jqe  reason: default package */
public abstract class jqe implements Parcelable {
    public static final iqe a = new iqe("");

    public final CharSequence a(dec dec) {
        return c(dec.a.getContext().getResources());
    }

    public final CharSequence b(Context context) {
        return c(context.getResources());
    }

    public final CharSequence c(Resources resources) {
        if (this instanceof eqe) {
            return resources.getString(((eqe) this).b);
        }
        if (this instanceof gqe) {
            gqe gqe = (gqe) this;
            Object[] array = gqe.c.toArray(new Object[0]);
            return resources.getString(gqe.b, Arrays.copyOf(array, array.length));
        } else if (this instanceof aqe) {
            aqe aqe = (aqe) this;
            int i = aqe.c;
            return resources.getQuantityString(aqe.b, i, new Object[]{Integer.valueOf(i)});
        } else if (this instanceof iqe) {
            return ((iqe) this).b;
        } else {
            if (this instanceof cqe) {
                cqe cqe = (cqe) this;
                Object[] array2 = cqe.o.toArray(new Object[0]);
                return resources.getQuantityString(cqe.b, cqe.c, Arrays.copyOf(array2, array2.length));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final CharSequence d(View view) {
        return c(view.getContext().getResources());
    }
}
