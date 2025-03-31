/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordscramble;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Ayomide
 */
public class SingleCharDocument extends PlainDocument {
    @Override
    public void insertString(int offset, String str, AttributeSet attr) 
            throws BadLocationException {
        if (str == null) return;
        
        // Allow only if total length ≤ 1
        if ((getLength() + str.length()) <= 1) {
            super.insertString(offset, str, attr);
        }
    }
}
