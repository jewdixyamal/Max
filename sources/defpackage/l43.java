package defpackage;

import com.facebook.fresco.middleware.HasExtraData;
import java.io.Closeable;

/* renamed from: l43  reason: default package */
public interface l43 extends Closeable, ru6, HasExtraData {
    void close();

    int getHeight();

    ru6 getImageInfo();

    pqb getQualityInfo();

    int getSizeInBytes();

    int getWidth();

    boolean isClosed();

    boolean isStateful();
}
