package com.pattern.decorator.iocase;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Filter;

/**
 * Created by quentin on 12/27/2016.
 */
public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = in.read();
        return(c == -1 ? c : Character.toLowerCase((char)c));
    }

    @Override
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = in.read(b, offset, len);
        for(int i = offset; i < offset+result; i++) {
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }

}
