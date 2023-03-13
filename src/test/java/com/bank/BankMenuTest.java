package com.bank;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.mockito.Mockito.*;
import com.bank.BankAccount;
import com.bank.BankMenu;
import com.bank.service.BankService;
import com.bank.service.impl.BankServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BankMenuTest {

    BankServiceImpl bankServiceImpl;
    BankMenu bankMenu;
    BankAccount bankAccount;
    @Mock
    BankService bankService;

    @Test
    public void testBankServiceWithdraw(){
        bankAccount = new BankAccount("Erika", "4");
        String simulatedUserInput = "c" + System.getProperty("line.separator") + "1800"
                + System.getProperty("line.separator")  + "a"
                + System.getProperty("line.separator")  + "e";
        InputStream savedStandardInputStream = (new ByteArrayInputStream(simulatedUserInput.getBytes()));
        System.setIn(savedStandardInputStream);
        bankMenu = new BankMenu(bankService,bankAccount);
        bankMenu.menu();
        verify(bankService, atLeastOnce()).withdraw(bankAccount, 1800);
    }

    @Test
    public void testBankServiceDeposit(){
        bankAccount = new BankAccount("Erika", "4");
        String simulatedUserInput = "b" + System.getProperty("line.separator") + "200"
                + System.getProperty("line.separator")  + "a"
                + System.getProperty("line.separator")  + "e";
        InputStream savedStandardInputStream = (new ByteArrayInputStream(simulatedUserInput.getBytes()));
        System.setIn(savedStandardInputStream);
        bankMenu = new BankMenu(bankService,bankAccount);
        bankMenu.menu();
        verify(bankService, atLeastOnce()).deposit(bankAccount, 200);
    }
}
