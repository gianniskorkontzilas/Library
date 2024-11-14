package com.library.library.service;

import com.library.library.dto.BorrowDTO;
import com.library.library.dto.BorrowSaveDTO;
import com.library.library.dto.BorrowUpdateDTO;
import com.library.library.entity.Borrow;
import com.library.library.repo.BookRepo;
import com.library.library.repo.BorrowRepo;
import com.library.library.repo.UserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BorrowServiceIMPL implements BorrowService {


    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private BorrowRepo borrowRepo;


    @Override
    public String addBorrow(BorrowSaveDTO borrowSaveDTO) {

        // Δημιουργία του αντικειμένου Borrow με τα δεδομένα από το BorrowSaveDTO
        Borrow borrow = new Borrow(
                bookRepo.getById(borrowSaveDTO.getBook_id()),
                userRepo.getById(borrowSaveDTO.getUser_id()),
                borrowSaveDTO.getBorrowDate(),
                borrowSaveDTO.getReturnDate()
        );

        // Αποθήκευση του borrow στην βάση δεδομένων
        borrowRepo.save(borrow);

        return "Borrow record successfully saved";
    }


    @Override
    public List<BorrowDTO> getAllBorrow() {

        List<Borrow> getBorrow = borrowRepo.findAll();
        List<BorrowDTO> borrowDTOList = new ArrayList<>();

        for(Borrow borrow : getBorrow)
        {
            BorrowDTO borrowDTO = new BorrowDTO(
                    borrow.getId(),
                    borrow.getBook(),
                    (com.library.library.entity.User) borrow.getUser(),
                    borrow.getBorrowDate(),
                    borrow.getReturnDate()

            );
            borrowDTOList.add(borrowDTO);

        }
        return borrowDTOList;


    }

    @Override
    public String updateBorrow(BorrowUpdateDTO borrowUpdateDTO) {

        try {


            if (borrowRepo.existsById(borrowUpdateDTO.getId())) {
                Borrow borrow = borrowRepo.getById(borrowUpdateDTO.getId());
                borrow.setBook(bookRepo.getById(borrowUpdateDTO.getBook_id()));
                borrow.setUser( userRepo.getById(borrowUpdateDTO.getUser_id()));
                borrow.setBorrowDate(borrowUpdateDTO.getBorrowDate());
                borrow.setReturnDate(borrowUpdateDTO.getReturnDate());

                borrowRepo.save(borrow);

                return "Borrow updated successfully.";

            } else {
                System.out.println("Borrow ID Not Found");
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;

    }
    }
