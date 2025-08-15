package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* renamed from: qw8  reason: default package */
public abstract class qw8 {
    protected volatile int cachedSize = -1;

    public static final <T extends qw8> T mergeFrom(T t, byte[] bArr, int i, int i2) throws InvalidProtocolBufferNanoException {
        try {
            x43 x43 = new x43(bArr, i, i2);
            t.mergeFrom(x43);
            x43.a(0);
            return t;
        } catch (InvalidProtocolBufferNanoException e) {
            throw e;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public static final boolean messageNanoEquals(qw8 qw8, qw8 qw82) {
        int serializedSize;
        if (qw8 == qw82) {
            return true;
        }
        if (qw8 == null || qw82 == null || qw8.getClass() != qw82.getClass() || qw82.getSerializedSize() != (serializedSize = qw8.getSerializedSize())) {
            return false;
        }
        byte[] bArr = new byte[serializedSize];
        byte[] bArr2 = new byte[serializedSize];
        toByteArray(qw8, bArr, 0, serializedSize);
        toByteArray(qw82, bArr2, 0, serializedSize);
        return Arrays.equals(bArr, bArr2);
    }

    public static final void toByteArray(qw8 qw8, byte[] bArr, int i, int i2) {
        try {
            y43 y43 = new y43(bArr, i, i2);
            qw8.writeTo(y43);
            if (y43.a.remaining() != 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public abstract int computeSerializedSize();

    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public int getSerializedSize() {
        int computeSerializedSize = computeSerializedSize();
        this.cachedSize = computeSerializedSize;
        return computeSerializedSize;
    }

    public abstract qw8 mergeFrom(x43 x43);

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            s5c.W((String) null, this, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            return "Error printing proto: " + e.getMessage();
        } catch (InvocationTargetException e2) {
            return "Error printing proto: " + e2.getMessage();
        }
    }

    public abstract void writeTo(y43 y43);

    public qw8 clone() throws CloneNotSupportedException {
        return (qw8) super.clone();
    }

    public static final <T extends qw8> T mergeFrom(T t, byte[] bArr) throws InvalidProtocolBufferNanoException {
        return mergeFrom(t, bArr, 0, bArr.length);
    }

    public static final byte[] toByteArray(qw8 qw8) {
        int serializedSize = qw8.getSerializedSize();
        byte[] bArr = new byte[serializedSize];
        toByteArray(qw8, bArr, 0, serializedSize);
        return bArr;
    }
}
