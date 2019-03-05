-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 05, 2017 at 12:00 AM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `library_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE IF NOT EXISTS `books` (
  `Serial` int(11) NOT NULL AUTO_INCREMENT,
  `Book_ID` int(11) NOT NULL,
  `Book_Name` varchar(100) NOT NULL,
  `Author` varchar(40) NOT NULL,
  `Publisher` varchar(100) NOT NULL,
  `ISBN_No` varchar(100) NOT NULL,
  `Edition` varchar(30) NOT NULL,
  `Pages` int(11) NOT NULL,
  PRIMARY KEY (`Serial`),
  UNIQUE KEY `book_id` (`Book_ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=24 ;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`Serial`, `Book_ID`, `Book_Name`, `Author`, `Publisher`, `ISBN_No`, `Edition`, `Pages`) VALUES
(3, 485, 'Thinking in Java', 'Bruce Eckel', 'Prentice Hall', '059600317', '4th edition', 1150),
(4, 325, ' C++ Programming Language', ' Bjarne Stroustrup', ' Addison-Wesley ', '978-0596005634', '3rd edition', 1030),
(5, 1197, 'C Programming Language', ' Dummies', 'Prentice Hall', '56348967', '1st edition', 978),
(6, 1742, 'Childen books', 'Rachel Carson ', 'Mariner', '34276540', '1st edition', 347),
(7, 431, 'Comic books', 'Jose Antonio Munoz', 'Ricardo Barreiro ', '340986032', '6th edition', 1230),
(8, 492, 'Mojar Golpo', 'Rafiq Roy', 'Maya', '80653409', '1st edition', 547),
(9, 1615, 'Guideline Pocket Book', 'Greer Hendricks', 'Malaika Adero', '10020-1513', '2nd edition', 1760),
(10, 987, 'Catch 22', 'Joshep Hillar', ' Shauna Summers', ' 212-782-9000', '3rd edition', 1830),
(11, 592, ' Gulliver’s Travels', ' Jonathan Swift', 'Mary Ann Bowman', ' 912-233-2446', '1st edition', 2238),
(12, 1442, ' Tom Jones', 'Henry Fielding', 'David Long', '952-996-1304', '6th edition', 470),
(13, 211, '. Emma', ' Jane Austen ', 'Transworld Publishers', '44-20-8579-2652', '1st edition', 1200),
(14, 807, ' The Moonstone', 'Louisa May Alcott ', ' Jamie Byng', '212-614-7984', '2nd edition', 776),
(15, 151, 'Tithir Tuale', 'Humayun Ahmed', 'Maya publications', '56729034', '1st edition', 77),
(16, 1731, 'Three Men in a Boat', 'Jerome K Jerome ', ' Avalon Publishing Group', ' 646-375-2570', '1st edition', 237),
(17, 1002, 'The Age of Innocence ', 'Edith Wharton', 'Chris Fischbac', '45890234', '2nd edition', 440),
(18, 1549, 'Matir Moyna', 'Humayon Ahmed', 'Spark publishers', '54237875', '1st edition', 68),
(19, 251, 'Tropic of Cancer', 'Henry Miller', 'Kensington Books', '345672345', '1st edition', 232),
(20, 1767, 'Murphy', 'Samuel Beckett', 'Tara Parson', '34-566-334', '1st edition', 432),
(21, 1861, ' A Clockwork Orange', 'Anthony Burgess', 'Stanley Kubrick’s', ' 212-782-900', '1st edition', 3300),
(22, 541, 'Java begginer book', 'Abul Kalam', 'Tsoft', '183-935-528-2', '1st edition', 122),
(23, 548, 'Java begginer book', 'Abul Kalam', 'Tsoft', '183-935-528-2', '1st edition', 122);

-- --------------------------------------------------------

--
-- Table structure for table `issuebook`
--

CREATE TABLE IF NOT EXISTS `issuebook` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Book_ID` int(11) NOT NULL,
  `Book_Name` varchar(100) NOT NULL,
  `Author` varchar(30) NOT NULL,
  `Publisher` varchar(50) NOT NULL,
  `Edition` varchar(20) NOT NULL,
  `Pages` int(8) NOT NULL,
  `Student_ID` int(11) NOT NULL,
  `St_Name` varchar(50) NOT NULL,
  `Semester` varchar(20) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Contact` varchar(11) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Issue_Date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `issuebook`
--

INSERT INTO `issuebook` (`id`, `Book_ID`, `Book_Name`, `Author`, `Publisher`, `Edition`, `Pages`, `Student_ID`, `St_Name`, `Semester`, `Email`, `Contact`, `Address`, `Issue_Date`) VALUES
(3, 485, 'Thinking in Java', 'Bruce Eckel', 'Prentice Hall', '4th edition', 1150, 15103058, 'Md. Abul Kalam', '8th semeste', 'ojkalam@gmail.com', '01819377270', 'Uttara', '2017-04-05');

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE IF NOT EXISTS `member` (
  `Student_ID` int(11) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Semester` varchar(20) NOT NULL,
  `Email` varchar(200) NOT NULL,
  `Contact` varchar(100) NOT NULL,
  `Address` varchar(20) NOT NULL,
  PRIMARY KEY (`Student_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`Student_ID`, `Name`, `Semester`, `Email`, `Contact`, `Address`) VALUES
(11502845, 'Roman Hossain', '9th semeste', 'romain554@gmail.com', '01676345678', 'Ghorashal'),
(13105038, 'Ormi Talukdar', '8th semeste', 'ormitm@gmail.com', '01712303745', 'Kumilla'),
(13203490, 'Shaila Nasrin', '6th semeste', 'nasrinrr@gmail.com', '01712323204', 'Kawran bajar'),
(13205437, 'Sabbir Rahman', '9th semeste', 'sabbir@gmail.com', '01715342678', 'Dinajpur'),
(13506743, 'Mia Hossain', '2nd semeste', 'hossain@gmail.com', '01725347652', 'Tangail'),
(14204032, 'Minhaj Islam', '1st semeste', 'minhajul@gmail.com', '01675230378', 'Madaripur'),
(15103023, 'Md. Mainul', '6th semeste', 'mainulkazy97@gmail.com', '01819230302', 'Chadpur'),
(15103026, 'Hasan Khan', '7th semeste', 'hasan123@gmail.com', '01534537845', 'Barishal'),
(15103029, 'Md Abdullah', '1st semeste', 'abdullah001rti@gmail.com', '01534236711', 'Khilkhet'),
(15103036, 'Md. Niamul Haque', '7th semeste', 'niamulim@gmail.com', '01676630442', 'Dhaka'),
(15103040, 'Jhumu', '4th semeste', 'jhum016@gmail.com', '01534267493', 'Ashkuna'),
(15103047, 'Md Suzon Mia', '2nd semeste', 'suzonim@gmail.com', '01521213602', 'Dhanmondi'),
(15103050, 'Mridula', '7th semeste', 'samri@gmail.com', '01672345674', 'New Market'),
(15103056, 'Saad', '4th semeste', 'raselhasandurjoy@gmail.com', '01715262830', 'Noakhali'),
(15103058, 'Md. Abul Kalam', '8th semeste', 'ojkalam@gmail.com', '01819377270', 'Uttara'),
(15104562, 'Shammi Akter', '6th semeste', 'sammi@gmail.com', '01718234563', 'Bagherhat'),
(15109345, 'Virat Koholi', '4th semeste', 'koholi90@gmail.com', '01713456724', 'Rongpur'),
(16103476, 'Mashrafi Bin Mortuja', '1st semeste', 'mashrafi344@gmail.com', '0165434762', 'Norshingdi'),
(16208734, 'Md. Sawpon', '1st semeste', 'swponim@gmail.com', '01819876534', 'Rajshahi'),
(17203456, 'Asif Rahman', '1st semeste', 'asifbd@gmail.com', '01532345678', 'Sonarga');

-- --------------------------------------------------------

--
-- Table structure for table `returnbook`
--

CREATE TABLE IF NOT EXISTS `returnbook` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Student_ID` varchar(11) NOT NULL,
  `St_Name` varchar(30) NOT NULL,
  `Semester` varchar(20) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Contact` int(11) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Book_ID` int(11) NOT NULL,
  `Book_Name` varchar(100) NOT NULL,
  `Author` varchar(30) NOT NULL,
  `Publisher` varchar(50) NOT NULL,
  `Edition` varchar(20) NOT NULL,
  `Pages` int(11) NOT NULL,
  `Issue_Date` date NOT NULL,
  `Return_Date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `returnbook`
--

INSERT INTO `returnbook` (`id`, `Student_ID`, `St_Name`, `Semester`, `Email`, `Contact`, `Address`, `Book_ID`, `Book_Name`, `Author`, `Publisher`, `Edition`, `Pages`, `Issue_Date`, `Return_Date`) VALUES
(1, '15103058', 'Md Abul Kalam', '7th semester', 'tipu4142@gmail.com', 1837237303, 'Uttara, Dhaka', 1194, 'Java Biginner Book', 'Tipu Sultan', 'Tsoftware Inc.', '5th edition', 1200, '2017-04-04', '2017-04-05'),
(2, '15103059', 'Md Abul Kalam Tipu', '8th semester', 'tipu2@gmail.com', 1837237303, 'Dhaka', 1194, 'Java Biginner Book', 'Tipu Sultan', 'Tsoftware Inc.', '5th edition', 1200, '2017-04-05', '2017-04-08'),
(3, '15103058', 'Md Abul Kalam', '7th semester', 'tipu4142@gmail.com', 1837237303, 'Uttara, Dhaka', 1194, 'Java Biginner Book', 'Tipu Sultan', 'Tsoftware Inc.', '5th edition', 1200, '2017-04-04', '2017-04-10');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL,
  `pass` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `pass`) VALUES
(1, 'tipu', '123'),
(2, 'asdf', '123'),
(3, 'a', 'b'),
(4, 'a', 'b'),
(5, 'kalam', '123'),
(7, 'kalam', '456'),
(8, 'asdf', 'saf'),
(9, 'niam', 'nnnn'),
(10, 'niam', 'nnnn');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
