
package com.usa.mintic.ciclo4.reto4.Controller;


import com.usa.mintic.ciclo4.reto4.Repository.CountClient;
import com.usa.mintic.ciclo4.reto4.Servicies.ReservationService;
import com.usa.mintic.ciclo4.reto4.Entities.Reservation;
import com.usa.mintic.ciclo4.reto4.Servicies.Status;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author MG1323
 */
@RestController
@RequestMapping("/api/Reservation")

public class ReservationController {
    @Autowired
    private ReservationService reservationService;
    @GetMapping("/all")
    public List<Reservation> getAll(){
        return reservationService.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Reservation> getReservation(@PathVariable("id") int id){
        return reservationService.getReservation(id);
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation reservation){
        return reservationService.save(reservation);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation update(@RequestBody Reservation reservation) {
        return reservationService.update(reservation);
    }

    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int reservationId){
        return reservationService.deleteReservation(reservationId);
    }
    
    ////////Reto 5///////
    
    @GetMapping("/report-clients")
    public List<CountClient> getReservationsReportClient(){
        return reservationService.getTopClients();
    }
    
    @GetMapping("/report-dates/{dateOne}/{dateTwo}")
    public List<Reservation> getReservationsReportDates(@PathVariable("dateOne") String dateOne,@PathVariable("dateTwo") String dateTwo){
        return reservationService.informePeriodoTiempoReservas(dateOne,dateTwo);
    }
    
     @GetMapping("/report-status")
    public Status getReservationsStatusReport(){
        return reservationService.getReservationStatusReport();
    }

 
}

